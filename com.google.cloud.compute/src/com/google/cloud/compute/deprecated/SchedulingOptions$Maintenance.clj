(ns com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance
  "Defines the maintenance behavior for this instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SchedulingOptions$Maintenance]))

(def *-migrate
  "Static Constant.

  The default behavior for standard instances.

  type: com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance"
  SchedulingOptions$Maintenance/MIGRATE)

(def *-terminate
  "Static Constant.

  The default and only possible behavior for preemptible instances.

  type: com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance"
  SchedulingOptions$Maintenance/TERMINATE)

(defn *value-of-strict
  "Get the Maintenance for the given String constant, and throw an exception if the constant is
   not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance [^java.lang.String constant]
    (SchedulingOptions$Maintenance/valueOfStrict constant)))

(defn *value-of
  "Get the Maintenance for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance [^java.lang.String constant]
    (SchedulingOptions$Maintenance/valueOf constant)))

(defn *values
  "Return the known values for Maintenance.

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance[]`"
  ([]
    (SchedulingOptions$Maintenance/values )))

