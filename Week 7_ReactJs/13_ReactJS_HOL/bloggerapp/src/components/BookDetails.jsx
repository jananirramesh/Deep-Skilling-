function BookDetails() {
  const books = [
    { name: 'Master React', cost: '670' },
    { name: 'Deep Dive into Angular 11', cost: '800' },
    { name: 'Mongo Essentials', cost: '450' },
  ];

  return (
    <div className="box2">
      <h3>Book Details</h3>
      {books.map((book, i) => (
        <div key={i}>
          <b>{book.name}</b>
          <p>{book.cost}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
