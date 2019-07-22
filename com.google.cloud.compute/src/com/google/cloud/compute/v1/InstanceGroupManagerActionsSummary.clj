(ns com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerActionsSummary]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary prototype]
    (InstanceGroupManagerActionsSummary/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder []
    (InstanceGroupManagerActionsSummary/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary []
    (InstanceGroupManagerActionsSummary/getDefaultInstance )))

(defn get-recreating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   recreated or are currently being being recreated. Recreating an instance deletes the existing
   root persistent disk and creates a new disk from the image that is defined in the instance
   template.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getRecreating))))

(defn get-verifying
  "[Output Only] The number of instances in the managed instance group that are being verified.
   See the managedInstances[].currentAction property in the listManagedInstances method
   documentation.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getVerifying))))

(defn get-creating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   created or are currently being created. If the group fails to create any of these instances, it
   tries again until it creates the instance successfully.

   If you have disabled creation retries, this field will not be populated; instead, the
   creatingWithoutRetries field will be populated.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getCreating))))

(defn get-none
  "[Output Only] The number of instances in the managed instance group that are running and have
   no scheduled actions.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getNone))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerActionsSummary this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerActionsSummary this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerActionsSummary this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-restarting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   restarted or are currently being restarted.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getRestarting))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerActionsSummary this]
    (-> this (.getApiMessageRequestBody))))

(defn get-refreshing
  "[Output Only] The number of instances in the managed instance group that are being reconfigured
   with properties that do not require a restart or a recreate action. For example, setting or
   removing target pools for the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getRefreshing))))

(defn get-abandoning
  "[Output Only] The total number of instances in the managed instance group that are scheduled to
   be abandoned. Abandoning an instance removes it from the managed instance group without
   deleting it.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getAbandoning))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.hashCode))))

(defn get-creating-without-retries
  "[Output Only] The number of instances that the managed instance group will attempt to create.
   The group attempts to create each instance only once. If the group fails to create any of these
   instances, it decreases the group's targetSize value accordingly.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getCreatingWithoutRetries))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerActionsSummary this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-deleting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   deleted or are currently being deleted.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary this]
    (-> this (.getDeleting))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary this]
    (-> this (.toBuilder))))

