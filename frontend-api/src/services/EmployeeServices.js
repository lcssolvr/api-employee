import axios from 'axios';

const API_URL = 'http://localhost:8080/api/employees';

class EmployeeServices {
    getEmployees() {
        return axios.get(API_URL);
    }
}

export default new EmployeeServices();