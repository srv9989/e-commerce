
FROM python:3.10-slim

# 2. Set working directory
WORKDIR /app

# 3. Copy files to container
COPY . .

# 4. Install Flask
RUN pip install flask

# 5. Run the app
CMD ["python", "main.py"]
