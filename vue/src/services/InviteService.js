import http from 'axios';

export default {

    addEvent() {
        return http.post("/invite", event)
    }
}