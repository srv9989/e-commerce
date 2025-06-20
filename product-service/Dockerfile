# 1. Use Node.js base image
FROM node:18-alpine

# 2. Set working directory
WORKDIR /app

# 3. Copy all files into the container
COPY . .

# 4. Install dependencies
RUN npm install

# 5. Run the app
CMD ["node", "index.js"]
