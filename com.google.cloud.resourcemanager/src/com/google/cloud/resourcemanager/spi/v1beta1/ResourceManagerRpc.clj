(ns com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager.spi.v1beta1 ResourceManagerRpc]))

(defn test-permissions
  "Tests whether the caller has the given permissions. Returns a list of booleans corresponding to
   whether or not the user has the permission in the same position of input list.

  project-id - `java.lang.String`
  permissions - `java.util.List`

  returns: `java.util.List<java.lang.Boolean>`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^java.util.List [^ResourceManagerRpc this ^java.lang.String project-id ^java.util.List permissions]
    (-> this (.testPermissions project-id permissions))))

(defn list
  "Lists the projects visible to the current user.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.cloudresourcemanager.model.Project>>`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.Tuple [^ResourceManagerRpc this ^java.util.Map options]
    (-> this (.list options))))

(defn delete
  "Marks the project identified by the specified project ID for deletion.

  project-id - `java.lang.String`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  ([^ResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.delete project-id))))

(defn undelete
  "Restores the project identified by the specified project ID. Undelete will only succeed if the
   project has a lifecycle state of DELETE_REQUESTED state. The caller must have modify
   permissions for this project.

  project-id - `java.lang.String`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  ([^ResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.undelete project-id))))

(defn replace
  "Replaces the attributes of the project. The caller must have modify permissions for this
   project.

  project - `com.google.api.services.cloudresourcemanager.model.Project`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Project [^ResourceManagerRpc this ^com.google.api.services.cloudresourcemanager.model.Project project]
    (-> this (.replace project))))

(defn get-policy
  "Returns the IAM policy associated with a project.

  project-id - `java.lang.String`

  returns: `com.google.api.services.cloudresourcemanager.model.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Policy [^ResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.getPolicy project-id))))

(defn create
  "Creates a new project.

  project - `com.google.api.services.cloudresourcemanager.model.Project`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Project [^ResourceManagerRpc this ^com.google.api.services.cloudresourcemanager.model.Project project]
    (-> this (.create project))))

(defn replace-policy
  "Replaces the IAM policy associated with the given project.

  project-id - `java.lang.String`
  new-policy - `com.google.api.services.cloudresourcemanager.model.Policy`

  returns: `com.google.api.services.cloudresourcemanager.model.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Policy [^ResourceManagerRpc this ^java.lang.String project-id ^com.google.api.services.cloudresourcemanager.model.Policy new-policy]
    (-> this (.replacePolicy project-id new-policy))))

(defn get
  "Retrieves the project identified by the specified project ID. Returns null if the
   project is not found or if the user doesn't have read permissions for the project.

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Project [^ResourceManagerRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.get project-id options))))

