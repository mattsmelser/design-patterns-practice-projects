package observers;

import javax.security.auth.Subject;

public interface Observer {
    void update(Subject subj, Object obj);
    }
