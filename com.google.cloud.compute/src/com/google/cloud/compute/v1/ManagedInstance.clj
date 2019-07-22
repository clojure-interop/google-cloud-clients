(ns com.google.cloud.compute.v1.ManagedInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstance]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ManagedInstance`

  returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^com.google.cloud.compute.v1.ManagedInstance prototype]
    (ManagedInstance/newBuilder prototype))
  (^com.google.cloud.compute.v1.ManagedInstance$Builder []
    (ManagedInstance/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ManagedInstance`"
  (^com.google.cloud.compute.v1.ManagedInstance []
    (ManagedInstance/getDefaultInstance )))

(defn get-current-action
  "[Output Only] The current action that the managed instance group has scheduled for the
   instance. Possible values: - NONE The instance is running, and the managed instance group does
   not have any scheduled actions for this instance. - CREATING The managed instance group is
   creating this instance. If the group fails to create this instance, it will try again until it
   is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create
   this instance only once. If the group fails to create this instance, it does not try again and
   the group's targetSize value is decreased instead. - RECREATING The managed instance group is
   recreating this instance. - DELETING The managed instance group is permanently deleting this
   instance. - ABANDONING The managed instance group is abandoning this instance. The instance
   will be removed from the instance group and from any target pools that are associated with this
   group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The
   managed instance group is applying configuration changes to the instance without stopping it.
   For example, the group can update the target pool list for an instance without stopping that
   instance. - VERIFYING The managed instance group has created the instance and it is in the
   process of being verified.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance this]
    (-> this (.getCurrentAction))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ManagedInstance this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ManagedInstance this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "[Output Only] The URL of the instance. The URL can exist even if the instance has not yet been
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance this]
    (-> this (.getInstance))))

(defn get-version
  "[Output Only] Intended version of this instance.

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion [^ManagedInstance this]
    (-> this (.getVersion))))

(defn get-instance-status
  "[Output Only] The status of the instance. This field is empty when the instance does not exist.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance this]
    (-> this (.getInstanceStatus))))

(defn get-id
  "[Output only] The unique identifier for this resource. This field is empty when instance does
   not exist.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstance this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ManagedInstance this]
    (-> this (.getApiMessageRequestBody))))

(defn get-last-attempt
  "[Output Only] Information about the last attempt to create or delete the instance.

  returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt [^ManagedInstance this]
    (-> this (.getLastAttempt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ManagedInstance this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ManagedInstance this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ManagedInstance$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstance$Builder [^ManagedInstance this]
    (-> this (.toBuilder))))

