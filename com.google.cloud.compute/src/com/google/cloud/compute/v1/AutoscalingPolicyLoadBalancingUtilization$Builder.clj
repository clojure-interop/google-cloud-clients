(ns com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyLoadBalancingUtilization$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder [^AutoscalingPolicyLoadBalancingUtilization$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization other]
    (-> this (.mergeFrom other))))

(defn get-utilization-target
  "Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
   autoscaler should maintain. Must be a positive float value. If not defined, the default is
   0.8.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyLoadBalancingUtilization$Builder this]
    (-> this (.getUtilizationTarget))))

(defn set-utilization-target
  "Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
   autoscaler should maintain. Must be a positive float value. If not defined, the default is
   0.8.

  utilization-target - `java.lang.Double`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder [^AutoscalingPolicyLoadBalancingUtilization$Builder this ^java.lang.Double utilization-target]
    (-> this (.setUtilizationTarget utilization-target))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization [^AutoscalingPolicyLoadBalancingUtilization$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder [^AutoscalingPolicyLoadBalancingUtilization$Builder this]
    (-> this (.clone))))

