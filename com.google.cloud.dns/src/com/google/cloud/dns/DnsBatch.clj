(ns com.google.cloud.dns.DnsBatch
  "A batch of operations to be submitted to Google Cloud DNS using a single RPC request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsBatch]))

(defn get-project
  "Adds a request representing the \"get project\" operation to this batch. The options can
   be used to restrict the fields returned in the same way as for Dns.getProject(Dns.ProjectOption...). Calling BatchResult.get() on the return value
   yields the created ProjectInfo if successful and throws a DnsException if the
   operation failed.

  options - `com.google.cloud.dns.Dns$ProjectOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.cloud.dns.ProjectInfo>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^com.google.cloud.dns.Dns$ProjectOption options]
    (-> this (.getProject options))))

(defn get-change-request
  "Adds a request representing the \"get change request\" operation for the zone specified by zoneName to this batch. The options can be used to restrict the fields returned in the
   same way as for Dns.getChangeRequest(String, String, Dns.ChangeRequestOption...).
   Calling BatchResult.get() on the return value yields the requested ChangeRequest if successful, null if the change request does not exist, or throws a
   DnsException if the operation failed or the zone does not exist.

  zone-name - `java.lang.String`
  change-request-id - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.cloud.dns.ChangeRequest>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name ^java.lang.String change-request-id ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.getChangeRequest zone-name change-request-id options))))

(defn list-change-requests
  "Adds a request representing the \"list change requests\" operation in the zone specified by
   zoneName to this batch. The options can be used to restrict the fields returned
   or provide page size limits in the same way as for Dns.listChangeRequests(String,
   Dns.ChangeRequestListOption...). Calling BatchResult.get() on the return value
   yields a page of change requests if successful and throws a DnsException if the
   operation failed or the zone does not exist.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ChangeRequestListOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.api.gax.paging.Page<com.google.cloud.dns.ChangeRequest>>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$ChangeRequestListOption options]
    (-> this (.listChangeRequests zone-name options))))

(defn submit
  "Submits this batch for processing using a single RPC request."
  ([^DnsBatch this]
    (-> this (.submit))))

(defn apply-change-request
  "Adds a request representing the \"apply change request\" operation to the zone specified by
   zoneName to this batch. The options can be used to restrict the fields returned
   in the same way as for Dns.applyChangeRequest(String, ChangeRequestInfo,
   Dns.ChangeRequestOption...). Calling BatchResult.get() on the return value yields
   the created ChangeRequest if successful or throws a DnsException if the
   operation failed or the zone does not exist.

  zone-name - `java.lang.String`
  change-request - `com.google.cloud.dns.ChangeRequestInfo`
  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.cloud.dns.ChangeRequest>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name ^com.google.cloud.dns.ChangeRequestInfo change-request ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.applyChangeRequest zone-name change-request options))))

(defn delete-zone
  "Adds a request representing the \"delete zone\" operation to this batch. Calling BatchResult.get() on the return value yields true upon successful deletion, false if the zone was not found, or throws a DnsException if the operation failed.

  zone-name - `java.lang.String`

  returns: `com.google.cloud.dns.DnsBatchResult<java.lang.Boolean>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name]
    (-> this (.deleteZone zone-name))))

(defn get-zone
  "Adds a request representing the \"get zone\" operation to this batch. The options can be
   used to restrict the fields returned in the same way as for Dns.getZone(String,
   Dns.ZoneOption...). Calling BatchResult.get() on the return value yields the
   requested Zone if successful, null if no such zone exists, or throws a DnsException if the operation failed.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ZoneOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.cloud.dns.Zone>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$ZoneOption options]
    (-> this (.getZone zone-name options))))

(defn list-record-sets
  "Adds a request representing the \"list record sets\" operation in the zone specified by zoneName to this batch. The options can be used to restrict the fields returned or
   provide page size limits in the same way as for Dns.listRecordSets(String,
   Dns.RecordSetListOption...). Calling BatchResult.get() on the return value yields a
   page of record sets if successful and throws a DnsException if the operation failed or
   the zone does not exist.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$RecordSetListOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.api.gax.paging.Page<com.google.cloud.dns.RecordSet>>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$RecordSetListOption options]
    (-> this (.listRecordSets zone-name options))))

(defn create-zone
  "Adds a request representing the \"create zone\" operation to this batch. The options can
   be used to restrict the fields returned in the same way as for Dns.create(ZoneInfo,
   Dns.ZoneOption...). Calling BatchResult.get() on the return value yields the
   created Zone if successful and throws a DnsException otherwise.

  zone - `com.google.cloud.dns.ZoneInfo`
  options - `com.google.cloud.dns.Dns$ZoneOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.cloud.dns.Zone>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^com.google.cloud.dns.ZoneInfo zone ^com.google.cloud.dns.Dns$ZoneOption options]
    (-> this (.createZone zone options))))

(defn list-zones
  "Adds a request representing the \"list zones\" operation to this batch. The options can
   be used to restrict the fields returned or provide page size limits in the same way as for
   Dns.listZones(Dns.ZoneListOption...). Calling BatchResult.get() on the
   return value yields a page of zones if successful and throws a DnsException otherwise.

  options - `com.google.cloud.dns.Dns$ZoneListOption`

  returns: `com.google.cloud.dns.DnsBatchResult<com.google.api.gax.paging.Page<com.google.cloud.dns.Zone>>`"
  (^com.google.cloud.dns.DnsBatchResult [^DnsBatch this ^com.google.cloud.dns.Dns$ZoneListOption options]
    (-> this (.listZones options))))

