package com.example.demo;


import com.example.demo.rest.User;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserList extends VerticalLayout {

    public UserList(UsersService service) {

        var grid = new Grid<User>(User.class);
        grid.setItems(service.getUsers());
        grid.setColumns("name", "phone", "website", "company.name");
        add(grid);
    }
}
