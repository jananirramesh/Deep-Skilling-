function BlogDetails() {
  const blogs = [
    {
      heading: 'React Learning',
      writer: 'Stephen Biz',
      msg: 'Welcome to learning React!',
    },
    {
      heading: 'Installation',
      writer: 'Schwezdenier',
      msg: 'You can install React from npm.',
    },
  ];

  return (
    <div className="box3">
      <h3>Blog Details</h3>
      {blogs.map((blog, i) => (
        <div key={i}>
          <b>{blog.heading}</b>
          <p><i>{blog.writer}</i></p>
          <p>{blog.msg}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
