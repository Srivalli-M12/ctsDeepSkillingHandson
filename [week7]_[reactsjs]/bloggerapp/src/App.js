import { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState('book');
  const [showCourse, setShowCourse] = useState(true);

  // Element variable example
  let currentView;
  if (view === 'book') currentView = <BookDetails />;
  else if (view === 'blog') currentView = <BlogDetails />;

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <button onClick={() => setView('book')}>Show Book</button>
      <button onClick={() => setView('blog')}>Show Blog</button>
      <button onClick={() => setShowCourse(!showCourse)}>
        {showCourse ? 'Hide' : 'Show'} Course
      </button>

      {/* Element variable */}
      {currentView}

      {/* Logical && rendering */}
      {showCourse && <CourseDetails />}

      {/* Ternary Operator */}
      <div>
        <h3>{view === 'book' ? 'You are viewing Books' : 'You are viewing Blogs'}</h3>
      </div>
    </div>
  );
}

export default App;
