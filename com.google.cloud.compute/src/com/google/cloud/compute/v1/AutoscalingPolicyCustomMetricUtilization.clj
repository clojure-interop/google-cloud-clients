(ns com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyCustomMetricUtilization]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization prototype]
    (AutoscalingPolicyCustomMetricUtilization/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder []
    (AutoscalingPolicyCustomMetricUtilization/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization []
    (AutoscalingPolicyCustomMetricUtilization/getDefaultInstance )))

(defn get-utilization-target
  "The target value of the metric that autoscaler should maintain. This must be a positive value.
   A utilization metric scales number of virtual machines handling requests to increase or
   decrease proportionally to the metric.

   For example, a good metric to use as a utilization_target is
   compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to keep
   this value constant for each of the instances.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.getUtilizationTarget))))

(defn get-metric
  "The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative
   values.

   The metric must have a value type of INT64 or DOUBLE.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.getMetric))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalingPolicyCustomMetricUtilization this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.getApiMessageRequestBody))))

(defn get-utilization-target-type
  "Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either
   GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.getUtilizationTargetType))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalingPolicyCustomMetricUtilization this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization this]
    (-> this (.toBuilder))))

