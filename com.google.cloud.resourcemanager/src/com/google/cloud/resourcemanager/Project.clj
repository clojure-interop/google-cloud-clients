(ns com.google.cloud.resourcemanager.Project
  "A Google Cloud Resource Manager project object.

  A Project is a high-level Google Cloud Platform entity. It is a container for ACLs, APIs,
  AppEngine Apps, VMs, and other Google Cloud Platform resources. This class' member variables are
  immutable. Methods that change or update the underlying Project information return a new Project
  instance. Project adds a layer of service-related functionality over ProjectInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager Project]))

(defn delete
  "Marks the project identified by the specified project ID for deletion.

   This method will only affect the project if the following criteria are met:


     The project does not have a billing account associated with it.
     The project has a lifecycle state of ProjectInfo.State.ACTIVE.


   This method changes the project's lifecycle state from ProjectInfo.State.ACTIVE to
   ProjectInfo.State.DELETE_REQUESTED. The deletion starts at an unspecified time, at
   which point the lifecycle state changes to ProjectInfo.State.DELETE_IN_PROGRESS. Until
   the deletion completes, you can check the lifecycle state checked by retrieving the project
   with ResourceManager.get(java.lang.String, com.google.cloud.resourcemanager.ResourceManager.ProjectGetOption...), and the project remains visible to ResourceManager.list(com.google.cloud.resourcemanager.ResourceManager.ProjectListOption...). However, you cannot update the project. After the deletion completes,
   the project is not retrievable by the ResourceManager.get(java.lang.String, com.google.cloud.resourcemanager.ResourceManager.ProjectGetOption...) and ResourceManager.list(com.google.cloud.resourcemanager.ResourceManager.ProjectListOption...) methods. The caller must have modify permissions for this project.

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  ([^Project this]
    (-> this (.delete))))

(defn undelete
  "Restores the project identified by the specified project ID.

   You can only use this method for a project that has a lifecycle state of ProjectInfo.State.DELETE_REQUESTED. After deletion starts, as indicated by a lifecycle state
   of ProjectInfo.State.DELETE_IN_PROGRESS, the project cannot be restored. The caller
   must have modify permissions for this project.

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure (including when the project can't be restored)"
  ([^Project this]
    (-> this (.undelete))))

(defn replace
  "Replaces the attributes of the project with the attributes of this project.

   The caller must have modify permissions for this project.

  returns: the Project representing the new project metadata - `com.google.cloud.resourcemanager.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.resourcemanager.Project [^Project this]
    (-> this (.replace))))

(defn get-policy
  "Returns the IAM access control policy for this project. Returns null if the resource
   does not exist or if you do not have adequate permission to view the project or get the policy.

  returns: the IAM policy for the project - `com.google.cloud.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.Policy [^Project this]
    (-> this (.getPolicy))))

(defn reload
  "Fetches the project's latest information. Returns null if the project does not exist.

  returns: Project containing the project's updated metadata or null if not found - `com.google.cloud.resourcemanager.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.resourcemanager.Project [^Project this]
    (-> this (.reload))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Project this]
    (-> this (.hashCode))))

(defn get-resource-manager
  "Returns the ResourceManager service object associated with this Project.

  returns: `com.google.cloud.resourcemanager.ResourceManager`"
  (^com.google.cloud.resourcemanager.ResourceManager [^Project this]
    (-> this (.getResourceManager))))

(defn replace-policy
  "Sets the IAM access control policy for this project. Replaces any existing policy. It is
   recommended that you use the read-modify-write pattern. See code samples and important details
   of replacing policies in the documentation for ResourceManager.replacePolicy(java.lang.String, com.google.cloud.Policy).

  new-policy - `com.google.cloud.Policy`

  returns: the newly set IAM policy for this project - `com.google.cloud.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.Policy [^Project this ^com.google.cloud.Policy new-policy]
    (-> this (.replacePolicy new-policy))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Project this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "returns: `com.google.cloud.resourcemanager.Project$Builder`"
  (^com.google.cloud.resourcemanager.Project$Builder [^Project this]
    (-> this (.toBuilder))))

