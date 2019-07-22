(ns com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyCpuUtilization]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder [^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization prototype]
    (AutoscalingPolicyCpuUtilization/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder []
    (AutoscalingPolicyCpuUtilization/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization []
    (AutoscalingPolicyCpuUtilization/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalingPolicyCpuUtilization this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalingPolicyCpuUtilization this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalingPolicyCpuUtilization this]
    (-> this (.getFieldMask))))

(defn get-utilization-target
  "The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   range (0, 1]. If not specified, the default is 0.6.

   If the CPU level is below the target utilization, the autoscaler scales down the number of
   instances until it reaches the minimum number of instances you specified or until the average
   CPU of your instances reaches the target utilization.

   If the average CPU is above the target utilization, the autoscaler scales up until it
   reaches the maximum number of instances you specified or until the average utilization reaches
   the target utilization.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyCpuUtilization this]
    (-> this (.getUtilizationTarget))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder [^AutoscalingPolicyCpuUtilization this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCpuUtilization this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalingPolicyCpuUtilization this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalingPolicyCpuUtilization this]
    (-> this (.hashCode))))

