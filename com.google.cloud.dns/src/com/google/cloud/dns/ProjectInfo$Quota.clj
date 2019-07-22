(ns com.google.cloud.dns.ProjectInfo$Quota
  "This class represents quotas assigned to the ProjectInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ProjectInfo$Quota]))

(defn get-rrsets-per-zone
  "Returns the maximum allowed number of RecordSets per ZoneInfo in the project.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getRrsetsPerZone))))

(defn get-zones
  "Returns the maximum allowed number of zones in the project.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getZones))))

(defn get-rrset-additions-per-change
  "Returns the maximum allowed number of RecordSets to add per ChangeRequest.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getRrsetAdditionsPerChange))))

(defn get-total-rrdata-size-per-change
  "Returns the maximum allowed size for total records in one ChangesRequest in bytes.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getTotalRrdataSizePerChange))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo$Quota this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.hashCode))))

(defn get-rrset-deletions-per-change
  "Returns the maximum allowed number of RecordSets to delete per ChangeRequest.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getRrsetDeletionsPerChange))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectInfo$Quota this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-resource-records-per-rrset
  "Returns the maximum allowed number of records per RecordSet.

  returns: `int`"
  (^Integer [^ProjectInfo$Quota this]
    (-> this (.getResourceRecordsPerRrset))))

