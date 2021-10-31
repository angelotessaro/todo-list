import React, {useEffect} from 'react';
import {Tabs, Layout, Row, Col, List } from 'antd';
import TodoItem from './TodoItem';

const TodoTab = ({todos, onTodoRemoval, onTodoToggle}) => {
    return (
        <>
            <List
                locale={{emptyText: 'No todos'}}
                dataSource={todos}
                renderItem={(todos) => {
                    <TodoItem
                        todo={todo}
                        onTodoToggle={onTodoToggle}
                        onTodoRemoval={onTodoRemoval}
                    />
                }}
                pagination={{
                    position: 'bottom',
                    pageSize: 10,
                }}
            />
        </>
    )
}

export default TodoTab;