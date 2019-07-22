(ns com.google.cloud.resourcemanager.ResourceManager
  "An interface for Google Cloud Resource Manager."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManager]))

(defn test-permissions
  "Returns the permissions that a caller has on the specified project. You typically don't call
   this method if you're using Google Cloud Platform directly to manage permissions. This method
   is intended for integration with your proprietary software, such as a customized graphical user
   interface. For example, the Cloud Platform Console tests IAM permissions internally to
   determine which UI should be available to the logged-in user. Each service that supports IAM
   lists the possible permissions; see the Supported Cloud Platform services page below for
   links to these lists.

  project-id - `java.lang.String`
  permissions - `java.util.List`

  returns: A list of booleans representing whether the caller has the permissions specified (in
       the order of the given permissions) - `java.util.List<java.lang.Boolean>`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^java.util.List [^ResourceManager this ^java.lang.String project-id ^java.util.List permissions]
    (-> this (.testPermissions project-id permissions))))

(defn list
  "Lists the projects visible to the current user.

   This method returns projects in an unspecified order. New projects do not necessarily appear
   at the end of the list. Use ResourceManager.ProjectListOption to filter this list, set page size, and
   set page tokens.

  options - `com.google.cloud.resourcemanager.ResourceManager$ProjectListOption`

  returns: Page<Project>, a page of projects - `com.google.api.gax.paging.Page<com.google.cloud.resourcemanager.Project>`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.gax.paging.Page [^ResourceManager this ^com.google.cloud.resourcemanager.ResourceManager$ProjectListOption options]
    (-> this (.list options))))

(defn delete
  "Marks the project identified by the specified project ID for deletion.

   This method will only affect the project if the following criteria are met:


     The project does not have a billing account associated with it.
     The project has a lifecycle state of ProjectInfo.State.ACTIVE.


   This method changes the project's lifecycle state from ProjectInfo.State.ACTIVE to
   ProjectInfo.State.DELETE_REQUESTED. The deletion starts at an unspecified time, at
   which point the lifecycle state changes to ProjectInfo.State.DELETE_IN_PROGRESS. Until
   the deletion completes, you can check the lifecycle state checked by retrieving the project
   with get(java.lang.String, com.google.cloud.resourcemanager.ResourceManager.ProjectGetOption...), and the project remains visible to list(com.google.cloud.resourcemanager.ResourceManager.ProjectListOption...). However, you cannot update the project. After the deletion completes,
   the project is not retrievable by the get(java.lang.String, com.google.cloud.resourcemanager.ResourceManager.ProjectGetOption...) and list(com.google.cloud.resourcemanager.ResourceManager.ProjectListOption...) methods. The caller must have modify permissions for this project.

  project-id - `java.lang.String`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  ([^ResourceManager this ^java.lang.String project-id]
    (-> this (.delete project-id))))

(defn undelete
  "Restores the project identified by the specified project ID.

   You can only use this method for a project that has a lifecycle state of ProjectInfo.State.DELETE_REQUESTED. After deletion starts, as indicated by a lifecycle state
   of ProjectInfo.State.DELETE_IN_PROGRESS, the project cannot be restored. The caller
   must have modify permissions for this project.

  project-id - `java.lang.String`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  ([^ResourceManager this ^java.lang.String project-id]
    (-> this (.undelete project-id))))

(defn replace
  "Replaces the attributes of the project.

   The caller must have modify permissions for this project.

  new-project - `com.google.cloud.resourcemanager.ProjectInfo`

  returns: the Project representing the new project metadata - `com.google.cloud.resourcemanager.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.resourcemanager.Project [^ResourceManager this ^com.google.cloud.resourcemanager.ProjectInfo new-project]
    (-> this (.replace new-project))))

(defn get-policy
  "Returns the IAM access control policy for the specified project. Returns null if the
   resource does not exist or if you do not have adequate permission to view the project or get
   the policy.

  project-id - `java.lang.String`

  returns: `com.google.cloud.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.Policy [^ResourceManager this ^java.lang.String project-id]
    (-> this (.getPolicy project-id))))

(defn create
  "Creates a new project.

   Initially, the project resource is owned by its creator exclusively. The creator can later
   grant permission to others to read or update the project. Several APIs are activated
   automatically for the project, including Google Cloud Storage.

  project - `com.google.cloud.resourcemanager.ProjectInfo`

  returns: Project object representing the new project's metadata. The returned object will
       include the following read-only fields supplied by the server: project number, lifecycle
       state, and creation time. - `com.google.cloud.resourcemanager.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.resourcemanager.Project [^ResourceManager this ^com.google.cloud.resourcemanager.ProjectInfo project]
    (-> this (.create project))))

(defn replace-policy
  "Sets the IAM access control policy for the specified project. Replaces any existing policy. The
   following constraints apply:


     Projects currently support only user:{emailid} and serviceAccount:{emailid}
         members in a binding of a policy.
     To be added as an owner, a user must be invited via Cloud Platform console and must
         accept the invitation.
     Members cannot be added to more than one role in the same policy.
     There must be at least one owner who has accepted the Terms of Service (ToS) agreement in
         the policy. An attempt to set a policy that removes the last ToS-accepted owner from the
         policy will fail.
     Calling this method requires enabling the App Engine Admin API.


   Note: Removing service accounts from policies or changing their roles can render services
   completely inoperable. It is important to understand how the service account is being used
   before removing or updating its roles.

   It is recommended that you use the read-modify-write pattern. This pattern entails reading
   the project's current policy, updating it locally, and then sending the modified policy for
   writing. Cloud IAM solves the problem of conflicting processes simultaneously attempting to
   modify a policy by using the etag property. This property is used to
   verify whether the policy has changed since the last request. When you make a request to Cloud
   IAM with an etag value, Cloud IAM compares the etag value in the request with the existing etag
   value associated with the policy. It writes the policy only if the etag values match. If the
   etags don't match, a ResourceManagerException is thrown, denoting that the server
   aborted update. If an etag is not provided, the policy is overwritten blindly.

   An example of using the read-write-modify pattern is as follows:



   Policy currentPolicy = resourceManager.getPolicy(\"my-project-id\");
   Policy modifiedPolicy = current.toBuilder()
       .removeIdentity(Role.viewer(), Identity.user(\"user@gmail.com\"))
       .build();
   Policy newPolicy = resourceManager.replacePolicy(\"my-project-id\", modified);

  project-id - `java.lang.String`
  new-policy - `com.google.cloud.Policy`

  returns: `com.google.cloud.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.Policy [^ResourceManager this ^java.lang.String project-id ^com.google.cloud.Policy new-policy]
    (-> this (.replacePolicy project-id new-policy))))

(defn get
  "Retrieves the project identified by the specified project ID.

   Returns null if the project is not found or if the user doesn't have read
   permissions for the project.

  project-id - `java.lang.String`
  options - `com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption`

  returns: `com.google.cloud.resourcemanager.Project`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.cloud.resourcemanager.Project [^ResourceManager this ^java.lang.String project-id ^com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption options]
    (-> this (.get project-id options))))

