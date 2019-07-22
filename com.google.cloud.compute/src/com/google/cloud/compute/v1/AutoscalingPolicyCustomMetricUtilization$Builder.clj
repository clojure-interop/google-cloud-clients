(ns com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyCustomMetricUtilization$Builder]))

(defn get-utilization-target
  "The target value of the metric that autoscaler should maintain. This must be a positive
   value. A utilization metric scales number of virtual machines handling requests to increase
   or decrease proportionally to the metric.

   For example, a good metric to use as a utilization_target is
   compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to
   keep this value constant for each of the instances.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyCustomMetricUtilization$Builder this]
    (-> this (.getUtilizationTarget))))

(defn get-metric
  "The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative
   values.

   The metric must have a value type of INT64 or DOUBLE.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCustomMetricUtilization$Builder this]
    (-> this (.getMetric))))

(defn set-utilization-target
  "The target value of the metric that autoscaler should maintain. This must be a positive
   value. A utilization metric scales number of virtual machines handling requests to increase
   or decrease proportionally to the metric.

   For example, a good metric to use as a utilization_target is
   compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to
   keep this value constant for each of the instances.

  utilization-target - `java.lang.Double`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization$Builder this ^java.lang.Double utilization-target]
    (-> this (.setUtilizationTarget utilization-target))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization [^AutoscalingPolicyCustomMetricUtilization$Builder this]
    (-> this (.build))))

(defn set-metric
  "The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative
   values.

   The metric must have a value type of INT64 or DOUBLE.

  metric - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization$Builder this ^java.lang.String metric]
    (-> this (.setMetric metric))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization other]
    (-> this (.mergeFrom other))))

(defn get-utilization-target-type
  "Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either
   GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyCustomMetricUtilization$Builder this]
    (-> this (.getUtilizationTargetType))))

(defn set-utilization-target-type
  "Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either
   GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.

  utilization-target-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization$Builder this ^java.lang.String utilization-target-type]
    (-> this (.setUtilizationTargetType utilization-target-type))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization$Builder [^AutoscalingPolicyCustomMetricUtilization$Builder this]
    (-> this (.clone))))

