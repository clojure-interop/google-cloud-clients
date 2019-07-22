(ns com.google.cloud.bigtable.admin.v2.models.PartialListInstancesException
  "Exception thrown when some zones are unavailable and listInstances is unable to return a full
  instance list. This exception can be inspected to get a partial list."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models PartialListInstancesException]))

(defn ->partial-list-instances-exception
  "Constructor.

  unavailable-zones - `java.util.List`
  instances - `java.util.List`"
  (^PartialListInstancesException [^java.util.List unavailable-zones ^java.util.List instances]
    (new PartialListInstancesException unavailable-zones instances)))

(defn get-unavailable-zones
  "A list of zones, whose unavailability caused this error.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PartialListInstancesException this]
    (-> this (.getUnavailableZones))))

(defn get-instances
  "A partial list of instances that were found in the available zones.

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.Instance>`"
  (^java.util.List [^PartialListInstancesException this]
    (-> this (.getInstances))))

