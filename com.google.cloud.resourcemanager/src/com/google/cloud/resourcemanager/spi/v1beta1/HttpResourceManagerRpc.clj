(ns com.google.cloud.resourcemanager.spi.v1beta1.HttpResourceManagerRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager.spi.v1beta1 HttpResourceManagerRpc]))

(defn ->http-resource-manager-rpc
  "Constructor.

  options - `com.google.cloud.resourcemanager.ResourceManagerOptions`"
  (^HttpResourceManagerRpc [^com.google.cloud.resourcemanager.ResourceManagerOptions options]
    (new HttpResourceManagerRpc options)))

(defn test-permissions
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`
  permissions - `java.util.List`

  returns: `java.util.List<java.lang.Boolean>`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^java.util.List [^HttpResourceManagerRpc this ^java.lang.String project-id ^java.util.List permissions]
    (-> this (.testPermissions project-id permissions))))

(defn list
  "Description copied from interface: ResourceManagerRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.cloudresourcemanager.model.Project>>`"
  (^com.google.cloud.Tuple [^HttpResourceManagerRpc this ^java.util.Map options]
    (-> this (.list options))))

(defn delete
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`"
  ([^HttpResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.delete project-id))))

(defn undelete
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`"
  ([^HttpResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.undelete project-id))))

(defn replace
  "Description copied from interface: ResourceManagerRpc

  project - `com.google.api.services.cloudresourcemanager.model.Project`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`"
  (^com.google.api.services.cloudresourcemanager.model.Project [^HttpResourceManagerRpc this ^com.google.api.services.cloudresourcemanager.model.Project project]
    (-> this (.replace project))))

(defn get-policy
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`

  returns: `com.google.api.services.cloudresourcemanager.model.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Policy [^HttpResourceManagerRpc this ^java.lang.String project-id]
    (-> this (.getPolicy project-id))))

(defn create
  "Description copied from interface: ResourceManagerRpc

  project - `com.google.api.services.cloudresourcemanager.model.Project`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`"
  (^com.google.api.services.cloudresourcemanager.model.Project [^HttpResourceManagerRpc this ^com.google.api.services.cloudresourcemanager.model.Project project]
    (-> this (.create project))))

(defn replace-policy
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`
  new-policy - `com.google.api.services.cloudresourcemanager.model.Policy`

  returns: `com.google.api.services.cloudresourcemanager.model.Policy`

  throws: com.google.cloud.resourcemanager.ResourceManagerException - upon failure"
  (^com.google.api.services.cloudresourcemanager.model.Policy [^HttpResourceManagerRpc this ^java.lang.String project-id ^com.google.api.services.cloudresourcemanager.model.Policy new-policy]
    (-> this (.replacePolicy project-id new-policy))))

(defn get
  "Description copied from interface: ResourceManagerRpc

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.cloudresourcemanager.model.Project`"
  (^com.google.api.services.cloudresourcemanager.model.Project [^HttpResourceManagerRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.get project-id options))))

