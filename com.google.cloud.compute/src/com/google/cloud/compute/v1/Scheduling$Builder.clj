(ns com.google.cloud.compute.v1.Scheduling$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Scheduling$Builder]))

(defn set-automatic-restart
  "Specifies whether the instance should be automatically restarted if it is terminated by
   Compute Engine (not terminated by a user). You can only set the automatic restart option for
   standard instances. Preemptible instances cannot be automatically restarted.

   By default, this is set to true so an instance is automatically restarted if it is
   terminated by Compute Engine.

  automatic-restart - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^java.lang.Boolean automatic-restart]
    (-> this (.setAutomaticRestart automatic-restart))))

(defn set-on-host-maintenance
  "Defines the maintenance behavior for this instance. For standard instances, the default
   behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   TERMINATE. For more information, see Setting Instance Scheduling Options.

  on-host-maintenance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^java.lang.String on-host-maintenance]
    (-> this (.setOnHostMaintenance on-host-maintenance))))

(defn add-all-node-affinities
  "A set of node affinity and anti-affinity.

  node-affinities - `java.util.List`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^java.util.List node-affinities]
    (-> this (.addAllNodeAffinities node-affinities))))

(defn get-preemptible?
  "Defines whether the instance is preemptible. This can only be set during instance creation,
   it cannot be set or changed after the instance has been created.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Scheduling$Builder this]
    (-> this (.getPreemptible))))

(defn get-on-host-maintenance
  "Defines the maintenance behavior for this instance. For standard instances, the default
   behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   TERMINATE. For more information, see Setting Instance Scheduling Options.

  returns: `java.lang.String`"
  (^java.lang.String [^Scheduling$Builder this]
    (-> this (.getOnHostMaintenance))))

(defn set-preemptible
  "Defines whether the instance is preemptible. This can only be set during instance creation,
   it cannot be set or changed after the instance has been created.

  preemptible - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^java.lang.Boolean preemptible]
    (-> this (.setPreemptible preemptible))))

(defn get-node-affinities-list
  "A set of node affinity and anti-affinity.

  returns: `java.util.List<com.google.cloud.compute.v1.SchedulingNodeAffinity>`"
  (^java.util.List [^Scheduling$Builder this]
    (-> this (.getNodeAffinitiesList))))

(defn build
  "returns: `com.google.cloud.compute.v1.Scheduling`"
  (^com.google.cloud.compute.v1.Scheduling [^Scheduling$Builder this]
    (-> this (.build))))

(defn add-node-affinities
  "A set of node affinity and anti-affinity.

  node-affinities - `com.google.cloud.compute.v1.SchedulingNodeAffinity`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^com.google.cloud.compute.v1.SchedulingNodeAffinity node-affinities]
    (-> this (.addNodeAffinities node-affinities))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Scheduling`

  returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this ^com.google.cloud.compute.v1.Scheduling other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Scheduling$Builder`"
  (^com.google.cloud.compute.v1.Scheduling$Builder [^Scheduling$Builder this]
    (-> this (.clone))))

(defn get-automatic-restart?
  "Specifies whether the instance should be automatically restarted if it is terminated by
   Compute Engine (not terminated by a user). You can only set the automatic restart option for
   standard instances. Preemptible instances cannot be automatically restarted.

   By default, this is set to true so an instance is automatically restarted if it is
   terminated by Compute Engine.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Scheduling$Builder this]
    (-> this (.getAutomaticRestart))))

