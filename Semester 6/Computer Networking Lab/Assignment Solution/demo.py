import socket

s = socket.socket()
s.connect(('localhost', 9988))
print("Connected to server")

while True:
    message = input("Enter message to send to server (type 'exit' to quit): ")
   
    if message.lower() == 'exit':
        break
   
    s.send(bytes(message, 'utf-8'))

s.close()
