(ns com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerUpdatePolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy prototype]
    (InstanceGroupManagerUpdatePolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder []
    (InstanceGroupManagerUpdatePolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy []
    (InstanceGroupManagerUpdatePolicy/getDefaultInstance )))

(defn get-type
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getType))))

(defn get-max-surge
  "The maximum number of instances that can be created above the specified targetSize during the
   update process. By default, a fixed value of 1 is used. This value can be either a fixed number
   or a percentage if the instance group has 10 or more instances. If you set a percentage, the
   number of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxSurge.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getMaxSurge))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.toString))))

(defn get-max-unavailable
  "The maximum number of instances that can be unavailable during the update process. An instance
   is considered available if all of the following conditions are satisfied:

   - The instance's status is RUNNING. - If there is a health check on the instance group, the
   instance's liveness health check result must be HEALTHY at least once. If there is no health
   check on the group, then the instance only needs to have a status of RUNNING to be considered
   available. By default, a fixed value of 1 is used. This value can be either a fixed number or a
   percentage if the instance group has 10 or more instances. If you set a percentage, the number
   of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxUnavailable.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getMaxUnavailable))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerUpdatePolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-minimal-action
  "Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   instances or REPLACE to delete and create new instances from the target template. If you
   specify a RESTART, the Updater will attempt to perform that action only. However, if the
   Updater determines that the minimal action you specify is not enough to perform the update, it
   might perform a more disruptive action.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getMinimalAction))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerUpdatePolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy this]
    (-> this (.toBuilder))))

