(ns com.google.cloud.storage.Acl$Project
  "Class for ACL Project entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Project]))

(defn ->project
  "Constructor.

  Creates a project entity.

  project-role - a role in the project, used to select project's teams - `com.google.cloud.storage.Acl$Project$ProjectRole`
  project-id - id of the project - `java.lang.String`"
  (^Acl$Project [^com.google.cloud.storage.Acl$Project$ProjectRole project-role ^java.lang.String project-id]
    (new Acl$Project project-role project-id)))

(defn get-project-role
  "Returns the role in the project for this entity.

  returns: `com.google.cloud.storage.Acl$Project$ProjectRole`"
  (^com.google.cloud.storage.Acl$Project$ProjectRole [^Acl$Project this]
    (-> this (.getProjectRole))))

(defn get-project-id
  "Returns the project id for this entity.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$Project this]
    (-> this (.getProjectId))))

