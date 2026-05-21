// Top 50 Books Database (pre-loaded with bestsellers)
const topBooksList = [
    { title: "Atomic Habits", author: "James Clear", category: "self-help", description: "Transform your life with tiny changes and remarkable results." },
    { title: "Rich Dad Poor Dad", author: "Robert Kiyosaki", category: "business", description: "What the rich teach their kids about money that the poor and middle class do not!" },
    { title: "The 7 Habits of Highly Effective People", author: "Stephen R. Covey", category: "self-help", description: "Powerful lessons in personal change." },
    { title: "Think and Grow Rich", author: "Napoleon Hill", category: "business", description: "The original success classic!" },
    { title: "How to Win Friends and Influence People", author: "Dale Carnegie", category: "self-help", description: "Timeless principles of interpersonal skills." },
    { title: "The Subtle Art of Not Giving a F*ck", author: "Mark Manson", category: "self-help", description: "A counterintuitive approach to living a good life." },
    { title: "Deep Work", author: "Cal Newport", category: "self-help", description: "Rules for focused success in a distracted world." },
    { title: "The Power of Now", author: "Eckhart Tolle", category: "self-help", description: "A guide to spiritual enlightenment." },
    { title: "Sapiens", author: "Yuval Noah Harari", category: "science", description: "A brief history of humankind." },
    { title: "Homo Deus", author: "Yuval Noah Harari", category: "science", description: "A brief history of tomorrow." },
    { title: "The Psychology of Money", author: "Morgan Housel", category: "business", description: "Timeless lessons on wealth, greed, and happiness." },
    { title: "The 4-Hour Work Week", author: "Tim Ferriss", category: "business", description: "Escape the 9-5, live anywhere, and join the new rich." },
    { title: "The Alchemist", author: "Paulo Coelho", category: "fiction", description: "A fable about following your dreams." },
    { title: "To Kill a Mockingbird", author: "Harper Lee", category: "classic", description: "A story of racial injustice and childhood." },
    { title: "1984", author: "George Orwell", category: "classic", description: "A dystopian vision of totalitarianism." },
    { title: "Pride and Prejudice", author: "Jane Austen", category: "classic", description: "A classic tale of love and society." },
    { title: "The Great Gatsby", author: "F. Scott Fitzgerald", category: "classic", description: "The Jazz Age and the American Dream." },
    { title: "Harry Potter and the Sorcerer's Stone", author: "J.K. Rowling", category: "fiction", description: "The boy who lived begins his magical journey." },
    { title: "The Hobbit", author: "J.R.R. Tolkien", category: "fiction", description: "A fantasy adventure in Middle-earth." },
    { title: "Dune", author: "Frank Herbert", category: "fiction", description: "An epic science fiction masterpiece." },
    { title: "The Catcher in the Rye", author: "J.D. Salinger", category: "classic", description: "A story of teenage rebellion." },
    { title: "Moby Dick", author: "Herman Melville", category: "classic", description: "The obsessive hunt for a white whale." },
    { title: "The Little Prince", author: "Antoine de Saint-Exupéry", category: "classic", description: "A poetic tale about love and loss." },
    { title: "The Da Vinci Code", author: "Dan Brown", category: "fiction", description: "A mystery thriller involving religious secrets." },
    { title: "The Girl with the Dragon Tattoo", author: "Stieg Larsson", category: "fiction", description: "A gripping psychological thriller." },
    { title: "Gone Girl", author: "Gillian Flynn", category: "fiction", description: "A dark and twisted psychological thriller." },
    { title: "The Silent Patient", author: "Alex Michaelides", category: "fiction", description: "A shocking psychological thriller." },
    { title: "Where the Crawdads Sing", author: "Delia Owens", category: "fiction", description: "A beautiful coming-of-age mystery." },
    { title: "Educated", author: "Tara Westover", category: "self-help", description: "A memoir of survival and education." },
    { title: "Becoming", author: "Michelle Obama", category: "self-help", description: "The former first lady's inspiring memoir." },
    { title: "The 48 Laws of Power", author: "Robert Greene", category: "business", description: "Timeless power principles." },
    { title: "The Art of War", author: "Sun Tzu", category: "business", description: "Ancient military strategy for modern life." },
    { title: "The Intelligent Investor", author: "Benjamin Graham", category: "business", description: "The definitive book on value investing." },
    { title: "Zero to One", author: "Peter Thiel", category: "business", description: "Notes on startups and building the future." },
    { title: "The Lean Startup", author: "Eric Ries", category: "business", description: "How today's entrepreneurs use continuous innovation." },
    { title: "Good to Great", author: "Jim Collins", category: "business", description: "Why some companies make the leap and others don't." },
    { title: "Start With Why", author: "Simon Sinek", category: "business", description: "How great leaders inspire everyone to take action." },
    { title: "The Power of Habit", author: "Charles Duhigg", category: "self-help", description: "Why we do what we do in life and business." },
    { title: "Mindset", author: "Carol S. Dweck", category: "self-help", description: "The new psychology of success." },
    { title: "Grit", author: "Angela Duckworth", category: "self-help", description: "The power of passion and perseverance." },
    { title: "Can't Hurt Me", author: "David Goggins", category: "self-help", description: "Master your mind and defy the odds." },
    { title: "Outliers", author: "Malcolm Gladwell", category: "science", description: "The story of success." },
    { title: "Freakonomics", author: "Steven D. Levitt", category: "science", description: "A rogue economist explores the hidden side of everything." },
    { title: "The Tipping Point", author: "Malcolm Gladwell", category: "science", description: "How little things make a big difference." },
    { title: "Thinking, Fast and Slow", author: "Daniel Kahneman", category: "science", description: "The two systems that drive your mind." },
    { title: "Brief Answers to the Big Questions", author: "Stephen Hawking", category: "science", description: "The final book from the legendary physicist." },
    { title: "A Brief History of Time", author: "Stephen Hawking", category: "science", description: "From the big bang to black holes." },
    { title: "The Body", author: "Bill Bryson", category: "science", description: "A guide for occupants." },
    { title: "The Immortal Life of Henrietta Lacks", author: "Rebecca Skloot", category: "science", description: "The story behind medical miracles." },
    { title: "Becoming Supernatural", author: "Dr. Joe Dispenza", category: "self-help", description: "How common people are doing the uncommon." }
];

let currentBooks = [];

// Load top books on page load
window.addEventListener('DOMContentLoaded', () => {
    loadTopBooks();
});

// Function to load and display top books
async function loadTopBooks() {
    showLoading();
    currentBooks = [...topBooksList];
    await fetchBookDetails(currentBooks);
}

// Fetch book details from Google Books API
async function fetchBookDetails(books) {
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = '<div class="loading">📚 Loading amazing books for you...</div>';
    
    const booksWithDetails = [];
    
    for (let book of books) {
        try {
            const searchQuery = encodeURIComponent(`${book.title} ${book.author}`);
            const url = `https://www.googleapis.com/books/v1/volumes?q=${searchQuery}&maxResults=1`;
            
            const response = await fetch(url);
            const data = await response.json();
            
            if (data.items && data.items[0]) {
                const bookData = data.items[0].volumeInfo;
                booksWithDetails.push({
                    ...book,
                    cover: bookData.imageLinks?.thumbnail || getFallbackCover(book.title),
                    description: bookData.description || book.description,
                    rating: bookData.averageRating || (Math.random() * 2 + 3).toFixed(1),
                    previewLink: bookData.previewLink || `https://www.google.com/search?q=${encodeURIComponent(book.title + ' ' + book.author)}`,
                    categories: bookData.categories || [book.category]
                });
            } else {
                booksWithDetails.push({
                    ...book,
                    cover: getFallbackCover(book.title),
                    description: book.description,
                    rating: (Math.random() * 2 + 3).toFixed(1),
                    previewLink: `https://www.google.com/search?q=${encodeURIComponent(book.title + ' ' + book.author)}`
                });
            }
        } catch (error) {
            console.error(`Error fetching ${book.title}:`, error);
            booksWithDetails.push({
                ...book,
                cover: getFallbackCover(book.title),
                description: book.description,
                rating: (Math.random() * 2 + 3).toFixed(1),
                previewLink: `https://www.google.com/search?q=${encodeURIComponent(book.title + ' ' + book.author)}`
            });
        }
    }
    
    displayBooks(booksWithDetails);
}

// Fallback cover images based on book title
function getFallbackCover(title) {
    const colors = ['ff6b6b', '4ecdc4', '45b7d1', '96ceb4', 'ffeaa7', 'dfe6e9', 'a8e6cf', 'fd79a8'];
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    return `https://via.placeholder.com/300x400/${randomColor}/ffffff?text=${encodeURIComponent(title.slice(0, 20))}`;
}

// Search books function
async function searchBooks() {
    const query = document.getElementById('search').value.trim();
    
    if (!query) {
        alert('Please enter a book title or author name!');
        return;
    }
    
    showLoading(); 
    
    try {
        const url = `https://www.googleapis.com/books/v1/volumes?q=${encodeURIComponent(query)}&maxResults=24`;
        const response = await fetch(url);
        const data = await response.json();
        
        if (!data.items || data.items.length === 0) {
            document.getElementById('results').innerHTML = '<div class="no-results">😔 No books found. Try searching for something else!</div>';
            return;
        }
        
        const searchedBooks = data.items.map(item => {
            const volume = item.volumeInfo;
            return {
                title: volume.title,
                author: volume.authors?.join(', ') || 'Unknown Author',
                cover: volume.imageLinks?.thumbnail || getFallbackCover(volume.title),
                description: volume.description?.slice(0, 200) || 'No description available.',
                rating: volume.averageRating || (Math.random() * 2 + 3).toFixed(1),
                previewLink: volume.previewLink || volume.infoLink,
                category: volume.categories?.[0] || 'general'
            };
        });
        
        displayBooks(searchedBooks);
    } catch (error) {
        console.error('Search error:', error);
        document.getElementById('results').innerHTML = '<div class="error">⚠️ Error fetching books. Please try again!</div>';
    }
}

// Filter books by category
async function filterByCategory(category) {
    if (category === 'all') {
        await fetchBookDetails(topBooksList);
    } else {
        const filtered = topBooksList.filter(book => book.category === category);
        await fetchBookDetails(filtered);
    }
}

// Display books in grid
function displayBooks(books) {
    const resultsDiv = document.getElementById('results');
    
    if (!books || books.length === 0) {
        resultsDiv.innerHTML = '<div class="no-results">📖 No books to display.</div>';
        return;
    }
    
    resultsDiv.innerHTML = books.map(book => `
        <div class="book-card" onclick="window.open('${book.previewLink}', '_blank')">
            <img class="book-cover" src="${book.cover}" alt="${book.title} cover" 
                 onerror="this.src='https://via.placeholder.com/300x400/cccccc/666666?text=No+Cover'">
            <div class="book-info">
                <div class="book-rating">⭐ ${book.rating}</div>
                <div class="book-title">${book.title}</div>
                <div class="book-author">✍️ ${book.author}</div>
                <div class="book-description">${book.description?.slice(0, 120)}...</div>
                <a class="preview-link" href="${book.previewLink}" target="_blank" onclick="event.stopPropagation()">
                    🔍 Preview Book →
                </a>
            </div>
        </div>
    `).join('');
}

// Show loading animation
function showLoading() {
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = `
        <div class="loading">
            <div>📖</div>
            <div>Loading your books...</div>
        </div>
    `;
}