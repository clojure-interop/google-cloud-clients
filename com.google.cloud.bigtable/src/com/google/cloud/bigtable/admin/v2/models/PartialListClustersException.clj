(ns com.google.cloud.bigtable.admin.v2.models.PartialListClustersException
  "Exception thrown when some zones are unavailable and listClusters is unable to return a full
  cluster list. This exception can be inspected to get a partial list."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models PartialListClustersException]))

(defn ->partial-list-clusters-exception
  "Constructor.

  This method is considered an internal implementation detail and not meant to be used by
   applications.

  unavailable-zones - `java.util.List`
  clusters - `java.util.List`"
  (^PartialListClustersException [^java.util.List unavailable-zones ^java.util.List clusters]
    (new PartialListClustersException unavailable-zones clusters)))

(defn get-unavailable-zones
  "A list of zones, whose unavailability caused this error.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PartialListClustersException this]
    (-> this (.getUnavailableZones))))

(defn get-clusters
  "A partial list of clusters that were found in the available zones.

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.Cluster>`"
  (^java.util.List [^PartialListClustersException this]
    (-> this (.getClusters))))

