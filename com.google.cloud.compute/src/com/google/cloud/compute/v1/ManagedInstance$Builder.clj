(ns com.google.cloud.compute.v1.ManagedInstance$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstance$Builder]))

(defn set-version
  "[Output Only] Intended version of this instance.

  version - `com.google.cloud.compute.v1.ManagedInstanceVersion`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^com.google.cloud.compute.v1.ManagedInstanceVersion version]
    (-> this (.setVersion version))))

(defn get-current-action
  "[Output Only] The current action that the managed instance group has scheduled for the
   instance. Possible values: - NONE The instance is running, and the managed instance group
   does not have any scheduled actions for this instance. - CREATING The managed instance group
   is creating this instance. If the group fails to create this instance, it will try again
   until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting
   to create this instance only once. If the group fails to create this instance, it does not
   try again and the group's targetSize value is decreased instead. - RECREATING The managed
   instance group is recreating this instance. - DELETING The managed instance group is
   permanently deleting this instance. - ABANDONING The managed instance group is abandoning
   this instance. The instance will be removed from the instance group and from any target pools
   that are associated with this group. - RESTARTING The managed instance group is restarting
   the instance. - REFRESHING The managed instance group is applying configuration changes to
   the instance without stopping it. For example, the group can update the target pool list for
   an instance without stopping that instance. - VERIFYING The managed instance group has
   created the instance and it is in the process of being verified.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance$Builder this]
    (-> this (.getCurrentAction))))

(defn set-current-action
  "[Output Only] The current action that the managed instance group has scheduled for the
   instance. Possible values: - NONE The instance is running, and the managed instance group
   does not have any scheduled actions for this instance. - CREATING The managed instance group
   is creating this instance. If the group fails to create this instance, it will try again
   until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting
   to create this instance only once. If the group fails to create this instance, it does not
   try again and the group's targetSize value is decreased instead. - RECREATING The managed
   instance group is recreating this instance. - DELETING The managed instance group is
   permanently deleting this instance. - ABANDONING The managed instance group is abandoning
   this instance. The instance will be removed from the instance group and from any target pools
   that are associated with this group. - RESTARTING The managed instance group is restarting
   the instance. - REFRESHING The managed instance group is applying configuration changes to
   the instance without stopping it. For example, the group can update the target pool list for
   an instance without stopping that instance. - VERIFYING The managed instance group has
   created the instance and it is in the process of being verified.

  current-action - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^java.lang.String current-action]
    (-> this (.setCurrentAction current-action))))

(defn set-id
  "[Output only] The unique identifier for this resource. This field is empty when instance does
   not exist.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-instance
  "[Output Only] The URL of the instance. The URL can exist even if the instance has not yet
   been created.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance$Builder this]
    (-> this (.getInstance))))

(defn get-version
  "[Output Only] Intended version of this instance.

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion [^ManagedInstance$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `com.google.cloud.compute.v1.ManagedInstance`"
  (^com.google.cloud.compute.v1.ManagedInstance [^ManagedInstance$Builder this]
    (-> this (.build))))

(defn get-instance-status
  "[Output Only] The status of the instance. This field is empty when the instance does not
   exist.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance$Builder this]
    (-> this (.getInstanceStatus))))

(defn get-id
  "[Output only] The unique identifier for this resource. This field is empty when instance does
   not exist.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance$Builder this]
    (-> this (.getId))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ManagedInstance`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^com.google.cloud.compute.v1.ManagedInstance other]
    (-> this (.mergeFrom other))))

(defn set-instance-status
  "[Output Only] The status of the instance. This field is empty when the instance does not
   exist.

  instance-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^java.lang.String instance-status]
    (-> this (.setInstanceStatus instance-status))))

(defn get-last-attempt
  "[Output Only] Information about the last attempt to create or delete the instance.

  returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt [^ManagedInstance$Builder this]
    (-> this (.getLastAttempt))))

(defn set-instance
  "[Output Only] The URL of the instance. The URL can exist even if the instance has not yet
   been created.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this]
    (-> this (.clone))))

(defn set-last-attempt
  "[Output Only] Information about the last attempt to create or delete the instance.

  last-attempt - `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance$Builder this ^com.google.cloud.compute.v1.ManagedInstanceLastAttempt last-attempt]
    (-> this (.setLastAttempt last-attempt))))

