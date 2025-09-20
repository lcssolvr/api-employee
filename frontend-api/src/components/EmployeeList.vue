<template>
    <div class="container">
        <h1 class="text-center mt-5">Lista de funcionários</h1>
        <table class="table table-stripped mt-5">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Primeiro nome</th>
                    <th>Último nome</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="employee in employees" v-bind:key="employee.id">
                    <td>{{ employee.id }}</td>
                    <td>{{ employee.name }}</td>
                    <td>{{ employee.position }}</td>
                    <td>{{ employee.salary }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import EmployeeServices from '../services/EmployeeServices';

    export default {
        name: "EmployeesList",
        data() {
            return {
                employees : []
            }
            
        },
        methods: {
            getEmployees() {
                EmployeeServices.getEmployees().then(response => {
                    this.employees = response.data;
                })
            }
        },
        mounted() {
            this.getEmployees();
        }
    }
</script>

<style>

</style>