import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  
  loadPosts = async () => {
    try {
      const response = await fetch("https://jsonplaceholder.typicode.com/posts");
      const data = await response.json();

      const postList = data.map(post => new Post(post.userId, post.id, post.title, post.body));
      this.setState({ posts: postList });
    } catch (error) {
      console.error("Error fetching posts:", error);
      throw error; 
    }
  };

  
  componentDidMount() {
    this.loadPosts();
  }

  
  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {
          this.state.posts.map(post => (
            <div key={post.id} style={{ border: '1px solid gray', padding: '10px', marginBottom: '10px' }}>
              <h2>{post.title}</h2>
              <p>{post.body}</p>
            </div>
          ))
        }
      </div>
    );
  }

  
  componentDidCatch(error, info) {
    alert("Something went wrong: " + error);
    console.log("Error Info:", info);
  }
}

export default Posts;
