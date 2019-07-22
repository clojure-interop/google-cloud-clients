(ns com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerActionsSummary$Builder]))

(defn get-recreating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   recreated or are currently being being recreated. Recreating an instance deletes the existing
   root persistent disk and creates a new disk from the image that is defined in the instance
   template.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getRecreating))))

(defn get-verifying
  "[Output Only] The number of instances in the managed instance group that are being verified.
   See the managedInstances[].currentAction property in the listManagedInstances method
   documentation.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getVerifying))))

(defn get-creating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   created or are currently being created. If the group fails to create any of these instances,
   it tries again until it creates the instance successfully.

   If you have disabled creation retries, this field will not be populated; instead, the
   creatingWithoutRetries field will be populated.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getCreating))))

(defn get-none
  "[Output Only] The number of instances in the managed instance group that are running and have
   no scheduled actions.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getNone))))

(defn set-recreating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   recreated or are currently being being recreated. Recreating an instance deletes the existing
   root persistent disk and creates a new disk from the image that is defined in the instance
   template.

  recreating - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer recreating]
    (-> this (.setRecreating recreating))))

(defn set-creating-without-retries
  "[Output Only] The number of instances that the managed instance group will attempt to create.
   The group attempts to create each instance only once. If the group fails to create any of
   these instances, it decreases the group's targetSize value accordingly.

  creating-without-retries - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer creating-without-retries]
    (-> this (.setCreatingWithoutRetries creating-without-retries))))

(defn set-deleting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   deleted or are currently being deleted.

  deleting - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer deleting]
    (-> this (.setDeleting deleting))))

(defn set-refreshing
  "[Output Only] The number of instances in the managed instance group that are being
   reconfigured with properties that do not require a restart or a recreate action. For example,
   setting or removing target pools for the instance.

  refreshing - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer refreshing]
    (-> this (.setRefreshing refreshing))))

(defn set-creating
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   created or are currently being created. If the group fails to create any of these instances,
   it tries again until it creates the instance successfully.

   If you have disabled creation retries, this field will not be populated; instead, the
   creatingWithoutRetries field will be populated.

  creating - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer creating]
    (-> this (.setCreating creating))))

(defn get-restarting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   restarted or are currently being restarted.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getRestarting))))

(defn set-restarting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   restarted or are currently being restarted.

  restarting - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer restarting]
    (-> this (.setRestarting restarting))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary other]
    (-> this (.mergeFrom other))))

(defn get-refreshing
  "[Output Only] The number of instances in the managed instance group that are being
   reconfigured with properties that do not require a restart or a recreate action. For example,
   setting or removing target pools for the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getRefreshing))))

(defn get-abandoning
  "[Output Only] The total number of instances in the managed instance group that are scheduled
   to be abandoned. Abandoning an instance removes it from the managed instance group without
   deleting it.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getAbandoning))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.clone))))

(defn set-none
  "[Output Only] The number of instances in the managed instance group that are running and have
   no scheduled actions.

  none - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer none]
    (-> this (.setNone none))))

(defn get-creating-without-retries
  "[Output Only] The number of instances that the managed instance group will attempt to create.
   The group attempts to create each instance only once. If the group fails to create any of
   these instances, it decreases the group's targetSize value accordingly.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getCreatingWithoutRetries))))

(defn set-abandoning
  "[Output Only] The total number of instances in the managed instance group that are scheduled
   to be abandoned. Abandoning an instance removes it from the managed instance group without
   deleting it.

  abandoning - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer abandoning]
    (-> this (.setAbandoning abandoning))))

(defn set-verifying
  "[Output Only] The number of instances in the managed instance group that are being verified.
   See the managedInstances[].currentAction property in the listManagedInstances method
   documentation.

  verifying - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary$Builder [^InstanceGroupManagerActionsSummary$Builder this ^java.lang.Integer verifying]
    (-> this (.setVerifying verifying))))

(defn get-deleting
  "[Output Only] The number of instances in the managed instance group that are scheduled to be
   deleted or are currently being deleted.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerActionsSummary$Builder this]
    (-> this (.getDeleting))))

