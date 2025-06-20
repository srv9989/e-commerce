const express = require('express');
const app = express();
const port = 5001;

app.get('/', (req, res) => {
    res.send('Welcome to Product Service!');
});

app.get('/products', (req, res) => {
    res.json([
        { id: 1, name: 'Camera' },
        { id: 2, name: 'Telescope' }
    ]);
});

app.listen(port, () => {
    console.log(`Product Service running at http://localhost:${port}`);
});
