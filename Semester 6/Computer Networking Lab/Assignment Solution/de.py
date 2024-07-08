
import socket

s = socket.socket()
print("Socket Created")

s.bind(('localhost', 9988))

s.listen(5)

print("Waiting for connection")

while True:
    c, addr = s.accept()
    print("Got connection from", addr)

    while True:
        message = c.recv(1024).decode()
        if not message:
            break
        print(f"Client ({addr}): {message}")

    c.close()