(ns com.google.cloud.dns.spi.v1.DnsRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 DnsRpc]))

(defn get-project
  "Returns information about the current project.

  options - a map of options for the service call - `java.util.Map`

  returns: up-to-date project information - `com.google.api.services.dns.model.Project`

  throws: com.google.cloud.dns.DnsException - upon failure or if the project is not found"
  (^com.google.api.services.dns.model.Project [^DnsRpc this ^java.util.Map options]
    (-> this (.getProject options))))

(defn get-change-request
  "Returns an existing change request.

  zone-name - the name of a zone to which the Change was be applied - `java.lang.String`
  change-request-id - the unique id assigned to the change by the server - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: up-to-date change object or null if change was not found - `com.google.api.services.dns.model.Change`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.api.services.dns.model.Change [^DnsRpc this ^java.lang.String zone-name ^java.lang.String change-request-id ^java.util.Map options]
    (-> this (.getChangeRequest zone-name change-request-id options))))

(defn list-change-requests
  "List existing change requests for a zone.

  zone-name - the name of a zone to which the Changes were be applied - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.Change>`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^DnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.listChangeRequests zone-name options))))

(defn apply-change-request
  "Applies change request to a zone.

  zone-name - the name of a zone to which the Change should be applied - `java.lang.String`
  change-request - change to be applied - `com.google.api.services.dns.model.Change`
  options - a map of options for the service call - `java.util.Map`

  returns: updated change object with server-assigned ID - `com.google.api.services.dns.model.Change`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.api.services.dns.model.Change [^DnsRpc this ^java.lang.String zone-name ^com.google.api.services.dns.model.Change change-request ^java.util.Map options]
    (-> this (.applyChangeRequest zone-name change-request options))))

(defn delete-zone
  "Deletes the zone identified by the name.

  zone-name - `java.lang.String`

  returns: true if the zone was deleted and false otherwise - `boolean`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^Boolean [^DnsRpc this ^java.lang.String zone-name]
    (-> this (.deleteZone zone-name))))

(defn create-batch
  "Creates an empty batch.

  returns: `com.google.cloud.dns.spi.v1.RpcBatch`"
  (^com.google.cloud.dns.spi.v1.RpcBatch [^DnsRpc this]
    (-> this (.createBatch))))

(defn get-zone
  "Retrieves and returns an existing zone.

  zone-name - name of the zone to be returned - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: a zone or null if not found - `com.google.api.services.dns.model.ManagedZone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.api.services.dns.model.ManagedZone [^DnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.getZone zone-name options))))

(defn list-record-sets
  "Lists record sets for a given zone.

  zone-name - name of the zone to be listed - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.ResourceRecordSet>`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^DnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.listRecordSets zone-name options))))

(defn create
  "Creates a new zone.

  zone - a zone to be created - `com.google.api.services.dns.model.ManagedZone`
  options - a map of options for the service call - `java.util.Map`

  returns: Updated ManagedZone object - `com.google.api.services.dns.model.ManagedZone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.api.services.dns.model.ManagedZone [^DnsRpc this ^com.google.api.services.dns.model.ManagedZone zone ^java.util.Map options]
    (-> this (.create zone options))))

(defn list-zones
  "Lists the zones that exist within the project.

  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.ManagedZone>`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^DnsRpc this ^java.util.Map options]
    (-> this (.listZones options))))

