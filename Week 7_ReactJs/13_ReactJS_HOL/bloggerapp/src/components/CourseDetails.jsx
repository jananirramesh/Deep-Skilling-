function CourseDetails() {
  const courses = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/20201' },
  ];

  return (
    <div className="box1">
      <h3>Course Details</h3>
      {courses.map((item, i) => (
        <div key={i}>
          <b>{item.name}</b>
          <p>{item.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
