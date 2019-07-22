(ns com.google.cloud.compute.deprecated.SchedulingOptions
  "A Google Compute Engine instance scheduling options. When there are system events that might
  cause your instances to be disrupted, Google Compute Engine automatically manages the scheduling
  decisions for your instances. Use SchedulingOptions.preemptible() to create a preemptible
  instance. Use SchedulingOptions.standard() to configure scheduling options for a standard
  instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SchedulingOptions]))

(defn *preemptible
  "Returns a SchedulingOptions object for a preemptible instance.

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions []
    (SchedulingOptions/preemptible )))

(defn *standard
  "Returns a SchedulingOptions object for a standard instance.

  automatic-restart - specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user) - `boolean`
  maintenance - defines the maintenance behavior for the instance - `com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance`

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions [^Boolean automatic-restart ^com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance maintenance]
    (SchedulingOptions/standard automatic-restart maintenance)))

(defn automatic-restart
  "Returns whether the instance should be automatically restarted if it is terminated by Compute
   Engine (not terminated by a user).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SchedulingOptions this]
    (-> this (.automaticRestart))))

(defn get-maintenance
  "Returns the maintenance behavior for the instance.

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance [^SchedulingOptions this]
    (-> this (.getMaintenance))))

(defn preemptible?
  "Returns true if the instance is preemptible, false otherwhise.

  returns: `boolean`"
  (^Boolean [^SchedulingOptions this]
    (-> this (.isPreemptible))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SchedulingOptions this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SchedulingOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SchedulingOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

