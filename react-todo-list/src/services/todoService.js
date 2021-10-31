const baseUrl = `${process.env.REACT_APP_API_URL}/tasks`;

export const loadTodos = () => {
  return fetch(baseUrl)
    .then(response => response.json());
    // .then(tasks => tasks);
}

export const getTodo = (id) => {
  return fetch(`${baseUrl}/${id}`)
    .then(response => response.json());
}

export const createTodo = (task) => {
  return fetch(baseUrl, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        title: task.title,
        completed: task.completed
    })
  }).then(response => response.json());
}

export const updateTodo = (task) => {
  return fetch(`${baseUrl}/${task.id}`, {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        id: task.id,
        title: task.title,
        completed: task.completed
    })
  }).then(response => response.json());
}

export const deleteTodo = (id) => {
    return fetch(`${baseUrl}/${id}`, {
        method: 'DELETE',
        headers: {
        'Content-Type': 'application/json'
        }
    }).then(response => response.json());
    }