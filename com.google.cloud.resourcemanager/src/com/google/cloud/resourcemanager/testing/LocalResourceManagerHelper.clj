(ns com.google.cloud.resourcemanager.testing.LocalResourceManagerHelper
  "Utility to create a local Resource Manager mock for testing.

  The mock runs in a separate thread, listening for HTTP requests on the local machine at an
  ephemeral port. While this mock attempts to simulate the Cloud Resource Manager, there are some
  divergences in behavior. The following is a non-exhaustive list of some of those behavioral
  differences:


    This mock assumes you have adequate permissions for any action. Related to this,
        testIamPermissions always indicates that the caller has all permissions listed in
        the request.
    IAM policies are set to an empty policy with version 0 (only legacy roles supported) upon
        project creation. The actual service will not have an empty list of bindings and may also
        set your version to 1.
    There is no input validation for the policy provided when replacing a policy or calling
        testIamPermissions.
    In this mock, projects never move from the DELETE_REQUESTED lifecycle state to
        DELETE_IN_PROGRESS without an explicit call to the utility method changeLifecycleState(java.lang.String, java.lang.String). Similarly, a project is never completely removed without an
        explicit call to the utility method removeProject(java.lang.String).
    The messages in the error responses given by this mock do not necessarily match the
        messages given by the actual service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager.testing LocalResourceManagerHelper]))

(defn *create
  "Creates a LocalResourceManagerHelper object that listens to requests on the local
   machine.

  returns: `com.google.cloud.resourcemanager.testing.LocalResourceManagerHelper`"
  (^com.google.cloud.resourcemanager.testing.LocalResourceManagerHelper []
    (LocalResourceManagerHelper/create )))

(defn get-options
  "Returns a ResourceManagerOptions instance that sets the host to use the mock server.

  returns: `com.google.cloud.resourcemanager.ResourceManagerOptions`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions [^LocalResourceManagerHelper this]
    (-> this (.getOptions))))

(defn start
  "Starts the thread that runs the Resource Manager server."
  ([^LocalResourceManagerHelper this]
    (-> this (.start))))

(defn stop
  "Stops the thread that runs the mock Resource Manager server."
  ([^LocalResourceManagerHelper this]
    (-> this (.stop))))

(defn change-lifecycle-state
  "Utility method to change the lifecycle state of the specified project.

  project-id - `java.lang.String`
  lifecycle-state - `java.lang.String`

  returns: true if the lifecycle state was successfully updated, false otherwise - `boolean`"
  (^Boolean [^LocalResourceManagerHelper this ^java.lang.String project-id ^java.lang.String lifecycle-state]
    (-> this (.changeLifecycleState project-id lifecycle-state))))

(defn remove-project
  "Utility method to remove the specified project.

   This method can be used to fully remove a project (to mimic when the server completely
   deletes a project).

  project-id - `java.lang.String`

  returns: true if the project was successfully deleted, false if the project didn't exist - `boolean`"
  (^Boolean [^LocalResourceManagerHelper this ^java.lang.String project-id]
    (-> this (.removeProject project-id))))

