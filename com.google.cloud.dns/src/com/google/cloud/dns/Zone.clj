(ns com.google.cloud.dns.Zone
  "A Google Cloud DNS Zone object.

  A zone is the container for all of your record sets that share the same DNS name prefix, for
  example, example.com. Zones are automatically assigned a set of name servers when they are
  created to handle responding to DNS queries for that zone. A zone has quotas for the number of
  record sets that it can include."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Zone]))

(defn delete
  "Deletes the zone. The method deletes the zone by name.

  returns: true is zone was found and deleted and false otherwise - `boolean`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^Boolean [^Zone this]
    (-> this (.delete))))

(defn get-dns
  "Returns the Dns service object associated with this zone.

  returns: `com.google.cloud.dns.Dns`"
  (^com.google.cloud.dns.Dns [^Zone this]
    (-> this (.getDns))))

(defn get-change-request
  "Retrieves an updated information about a change request previously submitted to be applied to
   this zone. Returns a ChangeRequest or null if the change request was not found.
   Throws DnsException if the zone is not found.

  change-request-id - `java.lang.String`
  options - optional restriction on what fields of ChangeRequest should be returned - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: updated ChangeRequest - `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone is not found"
  (^com.google.cloud.dns.ChangeRequest [^Zone this ^java.lang.String change-request-id ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.getChangeRequest change-request-id options))))

(defn list-change-requests
  "Retrieves all change requests for this zone. The method searches for zone by name. Returns a
   page of ChangeRequests.

  options - optional restriction on listing and fields to be returned - `com.google.cloud.dns.Dns$ChangeRequestListOption`

  returns: a page of change requests - `com.google.api.gax.paging.Page<com.google.cloud.dns.ChangeRequest>`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone is not found"
  (^com.google.api.gax.paging.Page [^Zone this ^com.google.cloud.dns.Dns$ChangeRequestListOption options]
    (-> this (.listChangeRequests options))))

(defn apply-change-request
  "Submits ChangeRequestInfo to the service for it to applied to this zone. The method
   searches for zone by name.

  change-request - `com.google.cloud.dns.ChangeRequestInfo`
  options - optional restriction on what fields of ChangeRequest should be returned - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: ChangeRequest with server-assigned ID - `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone is not found"
  (^com.google.cloud.dns.ChangeRequest [^Zone this ^com.google.cloud.dns.ChangeRequestInfo change-request ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.applyChangeRequest change-request options))))

(defn reload
  "Retrieves the latest information about the zone. The method retrieves the zone by name.

  options - optional restriction on what fields should be fetched - `com.google.cloud.dns.Dns$ZoneOption`

  returns: zone object containing updated information or null if not not found - `com.google.cloud.dns.Zone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.Zone [^Zone this ^com.google.cloud.dns.Dns$ZoneOption options]
    (-> this (.reload options))))

(defn list-record-sets
  "Lists all RecordSets associated with this zone. The method searches for zone by name.

  options - optional restriction on listing and fields of RecordSets returned - `com.google.cloud.dns.Dns$RecordSetListOption`

  returns: a page of record sets - `com.google.api.gax.paging.Page<com.google.cloud.dns.RecordSet>`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone is not found"
  (^com.google.api.gax.paging.Page [^Zone this ^com.google.cloud.dns.Dns$RecordSetListOption options]
    (-> this (.listRecordSets options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Zone this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Zone this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Description copied from class: ZoneInfo

  returns: `com.google.cloud.dns.Zone$Builder`"
  (^com.google.cloud.dns.Zone$Builder [^Zone this]
    (-> this (.toBuilder))))

