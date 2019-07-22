(ns com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerAutoHealingPolicy$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^InstanceGroupManagerAutoHealingPolicy$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy other]
    (-> this (.mergeFrom other))))

(defn get-health-check
  "The URL for the health check that signals autohealing.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAutoHealingPolicy$Builder this]
    (-> this (.getHealthCheck))))

(defn set-health-check
  "The URL for the health check that signals autohealing.

  health-check - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^InstanceGroupManagerAutoHealingPolicy$Builder this ^java.lang.String health-check]
    (-> this (.setHealthCheck health-check))))

(defn get-initial-delay-sec
  "The number of seconds that the managed instance group waits before it applies autohealing
   policies to new instances or recently recreated instances. This initial delay allows
   instances to initialize and run their startup scripts before the instance group determines
   that they are UNHEALTHY. This prevents the managed instance group from recreating its
   instances prematurely. This value must be from range [0, 3600].

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerAutoHealingPolicy$Builder this]
    (-> this (.getInitialDelaySec))))

(defn set-initial-delay-sec
  "The number of seconds that the managed instance group waits before it applies autohealing
   policies to new instances or recently recreated instances. This initial delay allows
   instances to initialize and run their startup scripts before the instance group determines
   that they are UNHEALTHY. This prevents the managed instance group from recreating its
   instances prematurely. This value must be from range [0, 3600].

  initial-delay-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^InstanceGroupManagerAutoHealingPolicy$Builder this ^java.lang.Integer initial-delay-sec]
    (-> this (.setInitialDelaySec initial-delay-sec))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy [^InstanceGroupManagerAutoHealingPolicy$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^InstanceGroupManagerAutoHealingPolicy$Builder this]
    (-> this (.clone))))

