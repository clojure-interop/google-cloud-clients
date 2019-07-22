(ns com.google.cloud.dns.Dns
  "An interface for the Google Cloud DNS service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns]))

(defn delete
  "Deletes an existing zone identified by name. Returns true if the zone was successfully
   deleted and false otherwise.

  zone-name - `java.lang.String`

  returns: true if zone was found and deleted and false otherwise - `boolean`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^Boolean [^Dns this ^java.lang.String zone-name]
    (-> this (.delete zone-name))))

(defn get-project
  "Retrieves the information about the current project. The returned fields can be optionally
   restricted by specifying Dns.ProjectOptions.

  fields - `com.google.cloud.dns.Dns$ProjectOption`

  returns: `com.google.cloud.dns.ProjectInfo`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.ProjectInfo [^Dns this ^com.google.cloud.dns.Dns$ProjectOption fields]
    (-> this (.getProject fields))))

(defn batch
  "Creates a new empty batch for grouping multiple service calls in one underlying RPC call.

  returns: `com.google.cloud.dns.DnsBatch`"
  (^com.google.cloud.dns.DnsBatch [^Dns this]
    (-> this (.batch))))

(defn get-change-request
  "Retrieves updated information about a change request previously submitted for a zone identified
   by ID. Returns null if the request cannot be found and throws an exception if the zone
   does not exist. The fields to be returned using can be specified using Dns.ChangeRequestOptions.

  zone-name - `java.lang.String`
  change-request-id - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone cannot be found"
  (^com.google.cloud.dns.ChangeRequest [^Dns this ^java.lang.String zone-name ^java.lang.String change-request-id ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.getChangeRequest zone-name change-request-id options))))

(defn list-change-requests
  "Lists the change requests for the zone identified by name that were submitted to the service.

   The sorting order for changes (based on when they were received by the server), fields to be
   returned, page size and page token can be specified using Dns.ChangeRequestListOptions.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ChangeRequestListOption`

  returns: A page of change requests - `com.google.api.gax.paging.Page<com.google.cloud.dns.ChangeRequest>`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone cannot be found"
  (^com.google.api.gax.paging.Page [^Dns this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$ChangeRequestListOption options]
    (-> this (.listChangeRequests zone-name options))))

(defn apply-change-request
  "Submits a change request for the specified zone. The returned object contains the following
   read-only fields supplied by the server: id, start time and status. time, id, and list of name
   servers. The fields to be returned can be selected by Dns.ChangeRequestOptions.

  zone-name - `java.lang.String`
  change-request - `com.google.cloud.dns.ChangeRequestInfo`
  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: the new ChangeRequest - `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone is not found"
  (^com.google.cloud.dns.ChangeRequest [^Dns this ^java.lang.String zone-name ^com.google.cloud.dns.ChangeRequestInfo change-request ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.applyChangeRequest zone-name change-request options))))

(defn get-zone
  "Returns the zone by the specified zone name. Returns null if the zone is not found. The
   returned fields can be optionally restricted by specifying Dns.ZoneOptions.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ZoneOption`

  returns: `com.google.cloud.dns.Zone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.Zone [^Dns this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$ZoneOption options]
    (-> this (.getZone zone-name options))))

(defn list-record-sets
  "Lists the record sets in the zone identified by name.

   The fields to be returned, page size and page tokens can be specified using Dns.RecordSetListOptions.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$RecordSetListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.dns.RecordSet>`

  throws: com.google.cloud.dns.DnsException - upon failure or if the zone cannot be found"
  (^com.google.api.gax.paging.Page [^Dns this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$RecordSetListOption options]
    (-> this (.listRecordSets zone-name options))))

(defn create
  "Creates a new zone.

   Returns Zone object representing the new zone's information. In addition to the
   name, dns name and description (supplied by the user within the zoneInfo parameter),
   the returned object can include the following read-only fields supplied by the server: creation
   time, id, and list of name servers. The returned fields can be optionally restricted by
   specifying Dns.ZoneOptions.

  zone-info - `com.google.cloud.dns.ZoneInfo`
  options - `com.google.cloud.dns.Dns$ZoneOption`

  returns: `com.google.cloud.dns.Zone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.Zone [^Dns this ^com.google.cloud.dns.ZoneInfo zone-info ^com.google.cloud.dns.Dns$ZoneOption options]
    (-> this (.create zone-info options))))

(defn list-zones
  "Lists the zones inside the project.

   This method returns zones in an unspecified order. New zones do not necessarily appear at
   the end of the list. Use Dns.ZoneListOption to restrict the listing to a domain name, set
   page size, and set page token.

  options - `com.google.cloud.dns.Dns$ZoneListOption`

  returns: a page of zones - `com.google.api.gax.paging.Page<com.google.cloud.dns.Zone>`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.api.gax.paging.Page [^Dns this ^com.google.cloud.dns.Dns$ZoneListOption options]
    (-> this (.listZones options))))

