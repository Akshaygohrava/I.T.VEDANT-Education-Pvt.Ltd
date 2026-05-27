// ─── Static top books — always show instantly on page load ───────────────────
const TOP_BOOKS = [
  {
    title: "Atomic Habits",
    author: "James Clear",
    year: "2018",
    description:
      "Tiny changes, remarkable results. Learn how small 1% improvements compound into life-changing habits.",
    cover: "https://covers.openlibrary.org/b/id/10525351-L.jpg",
    link: "https://jamesclear.com/atomic-habits",
  },
  {
    title: "Rich Dad Poor Dad",
    author: "Robert T. Kiyosaki",
    year: "1997",
    description:
      "What the rich teach their kids about money — that the poor and middle class do not. A personal finance classic.",
    cover: "https://covers.openlibrary.org/b/id/9251753-L.jpg",
    link: "https://openlibrary.org/works/OL15358516W",
  },
  {
    title: "The Psychology of Money",
    author: "Morgan Housel",
    year: "2020",
    description:
      "Timeless lessons on wealth, greed, and happiness. How people think about money and how to think better.",
    cover: "https://covers.openlibrary.org/b/id/10527843-L.jpg",
    link: "https://openlibrary.org/works/OL21359651W",
  },
  {
    title: "Deep Work",
    author: "Cal Newport",
    year: "2016",
    description:
      "Rules for focused success in a distracted world. Master the ability to focus without distraction on hard tasks.",
    cover: "https://covers.openlibrary.org/b/id/8739161-L.jpg",
    link: "https://openlibrary.org/works/OL17756755W",
  },
  {
    title: "Mindset",
    author: "Carol S. Dweck",
    year: "2006",
    description:
      "The new psychology of success. Discover how a growth mindset can help you fulfil your potential.",
    cover: "https://covers.openlibrary.org/b/id/8739180-L.jpg",
    link: "https://openlibrary.org/works/OL5843641W",
  },
  {
    title: "Start With Why",
    author: "Simon Sinek",
    year: "2009",
    description:
      "How great leaders inspire everyone to take action by starting with purpose — the 'why' behind everything.",
    cover: "https://covers.openlibrary.org/b/id/8091016-L.jpg",
    link: "https://openlibrary.org/works/OL15850774W",
  },
  {
    title: "Think and Grow Rich",
    author: "Napoleon Hill",
    year: "1937",
    description:
      "The original success classic. 13 steps to personal achievement derived from interviewing 500 millionaires.",
    cover: "https://covers.openlibrary.org/b/id/8226695-L.jpg",
    link: "https://openlibrary.org/works/OL107258W",
  },
  {
    title: "Grit",
    author: "Angela Duckworth",
    year: "2016",
    description:
      "The power of passion and perseverance. Why talent alone doesn't make a champion — grit does.",
    cover: "https://covers.openlibrary.org/b/id/8739191-L.jpg",
    link: "https://openlibrary.org/works/OL17612447W",
  },
  {
    title: "The 7 Habits of Highly Effective People",
    author: "Stephen R. Covey",
    year: "1989",
    description:
      "Powerful lessons in personal change. A principle-centred approach for solving personal and professional problems.",
    cover: "https://covers.openlibrary.org/b/id/8226696-L.jpg",
    link: "https://openlibrary.org/works/OL2757966W",
  },
  {
    title: "Zero to One",
    author: "Peter Thiel",
    year: "2014",
    description:
      "Notes on startups and how to build the future. True innovation means doing something no one has done before.",
    cover: "https://covers.openlibrary.org/b/id/8225121-L.jpg",
    link: "https://openlibrary.org/works/OL17364829W",
  },
  {
    title: "The Lean Startup",
    author: "Eric Ries",
    year: "2011",
    description:
      "How today's entrepreneurs use continuous innovation to create radically successful businesses.",
    cover: "https://covers.openlibrary.org/b/id/7898882-L.jpg",
    link: "https://openlibrary.org/works/OL16121664W",
  },
  {
    title: "The Power of Habit",
    author: "Charles Duhigg",
    year: "2012",
    description:
      "Why we do what we do in life and business — and how to change it using the science of habit loops.",
    cover: "https://covers.openlibrary.org/b/id/8225122-L.jpg",
    link: "https://openlibrary.org/works/OL16517788W",
  },
  {
    title: "Sapiens",
    author: "Yuval Noah Harari",
    year: "2011",
    description:
      "A brief history of humankind — from the Stone Age to the modern age. A sweeping account of human civilisation.",
    cover: "https://covers.openlibrary.org/b/id/8226697-L.jpg",
    link: "https://openlibrary.org/works/OL17811025W",
  },
  {
    title: "Can't Hurt Me",
    author: "David Goggins",
    year: "2018",
    description:
      "Master your mind and defy the odds. How to unlock the 40% of your potential you're leaving untapped.",
    cover: "https://covers.openlibrary.org/b/id/9251800-L.jpg",
    link: "https://openlibrary.org/works/OL20652099W",
  },
  {
    title: "The Subtle Art of Not Giving a F*ck",
    author: "Mark Manson",
    year: "2016",
    description:
      "A counterintuitive approach to living a good life. Stop trying to be positive all the time and embrace struggle.",
    cover: "https://covers.openlibrary.org/b/id/8444671-L.jpg",
    link: "https://openlibrary.org/works/OL17756724W",
  },
  {
    title: "How to Win Friends and Influence People",
    author: "Dale Carnegie",
    year: "1936",
    description:
      "Timeless principles for connecting with people, winning them over, and making a lasting impression.",
    cover: "https://covers.openlibrary.org/b/id/8226700-L.jpg",
    link: "https://openlibrary.org/works/OL66554W",
  },
  {
    title: "The 4-Hour Work Week",
    author: "Tim Ferriss",
    year: "2007",
    description:
      "Escape the 9-5, live anywhere, and join the new rich. A step-by-step blueprint for luxury lifestyle design.",
    cover: "https://covers.openlibrary.org/b/id/8225123-L.jpg",
    link: "https://openlibrary.org/works/OL7961498W",
  },
  {
    title: "Educated",
    author: "Tara Westover",
    year: "2018",
    description:
      "A memoir about a young woman who, kept out of school, leaves her survivalist family and goes on to earn a PhD.",
    cover: "https://covers.openlibrary.org/b/id/8978507-L.jpg",
    link: "https://openlibrary.org/works/OL17930368W",
  },
];

// ─── DOM references ───────────────────────────────────────────────────────────
const bookGrid = document.getElementById("bookGrid");
const sectionTitle = document.getElementById("sectionTitle");
const searchInput = document.getElementById("searchInput");

// ─── Events ───────────────────────────────────────────────────────────────────
document.getElementById("searchBtn").addEventListener("click", searchBooks);
document.getElementById("topBooksBtn").addEventListener("click", showTopBooks);
searchInput.addEventListener("keypress", (e) => {
  if (e.key === "Enter") searchBooks();
});

document.addEventListener("DOMContentLoaded", showTopBooks);

// ─── Show hardcoded top books instantly ───────────────────────────────────────
function showTopBooks() {
  sectionTitle.textContent = "Top Books";
  renderStaticBooks(TOP_BOOKS);
}

async function searchBooks() {
  const query = searchInput.value.trim();
  if (!query) {
    alert("Please enter a book title or author.");
    return;
  }

  sectionTitle.textContent = `Results for "${query}"`;
  showLoading();

  try {
    const url = `https://openlibrary.org/search.json?q=${encodeURIComponent(
      query
    )}&limit=20`;
    const response = await fetch(url);
    const data = await response.json();

    if (!data.docs?.length) {
      showError("No books found. Try a different search.");
      return;
    }

    const books = data.docs.map((doc) => ({
      title: doc.title || "Unknown Title",
      author: doc.author_name?.join(", ") || "Unknown Author",
      year: doc.first_publish_year || "N/A",
      description: getDescriptionFromDoc(doc),
      cover: doc.cover_i
        ? `https://covers.openlibrary.org/b/id/${doc.cover_i}-L.jpg`
        : "",
      link: doc.key ? `https://openlibrary.org${doc.key}` : "#",
    }));

    renderStaticBooks(books);
  } catch (error) {
    console.error(error);
    showError("Search failed. Please check your connection.");
  }
}

// ─── Render ───────────────────────────────────────────────────────────────────
function renderStaticBooks(books) {
  bookGrid.innerHTML = books.map(createCard).join("");
}

function createCard(book) {
  const cover = book.cover ||
    `https://placehold.co/200x300/1a1a2e/a78bfa?text=${encodeURIComponent(book.title.slice(0, 12))}`;

  return `
    <article class="card">
      <div class="card-img-wrap">
        <img class="card-img" src="${cover}" alt="${book.title}" loading="lazy"
          onerror="this.src='https://placehold.co/200x300/1a1a2e/a78bfa?text=No+Cover'">
      </div>
      <div class="card-body">
        <h3 class="card-title">${book.title}</h3>
        <p class="card-author">✍️ ${book.author}</p>
        <p class="card-meta">📅 ${book.year}</p>
        <p class="card-desc">${book.description}</p>
        <a class="card-btn" href="${book.link}" target="_blank" rel="noopener">View Book →</a>
      </div>
    </article>
  `;
}

// ─── Helpers ──────────────────────────────────────────────────────────────────
function cleanText(text) {
  return text.replace(/<[^>]+>/g, "").replace(/\s+/g, " ").trim();
}

function getDescriptionFromDoc(doc) {
  if (doc.first_sentence) {
    const sentence = Array.isArray(doc.first_sentence)
      ? doc.first_sentence[0]
      : doc.first_sentence;
    return cleanText(sentence).slice(0, 130);
  }

  if (doc.subject && doc.subject.length) {
    return `Topics: ${doc.subject.slice(0, 4).join(", ")}`;
  }

  return "No description available.";
}

function showLoading() {
  bookGrid.innerHTML = `<p class="loading">🔍 Searching books...</p>`;
}

function showError(message) {
  bookGrid.innerHTML = `<p class="error">⚠️ ${message}</p>`;
}
