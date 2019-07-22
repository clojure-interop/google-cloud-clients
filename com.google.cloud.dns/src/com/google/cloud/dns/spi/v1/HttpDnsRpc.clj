(ns com.google.cloud.dns.spi.v1.HttpDnsRpc
  "A default implementation of the DnsRpc interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 HttpDnsRpc]))

(defn ->http-dns-rpc
  "Constructor.

  Constructs an instance of this rpc client with provided DnsOptions.

  options - `com.google.cloud.dns.DnsOptions`"
  (^HttpDnsRpc [^com.google.cloud.dns.DnsOptions options]
    (new HttpDnsRpc options)))

(defn get-project
  "Description copied from interface: DnsRpc

  options - a map of options for the service call - `java.util.Map`

  returns: up-to-date project information - `com.google.api.services.dns.model.Project`

  throws: com.google.cloud.dns.DnsException - upon failure or if the project is not found"
  (^com.google.api.services.dns.model.Project [^HttpDnsRpc this ^java.util.Map options]
    (-> this (.getProject options))))

(defn get-change-request
  "Description copied from interface: DnsRpc

  zone-name - the name of a zone to which the Change was be applied - `java.lang.String`
  change-request-id - the unique id assigned to the change by the server - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: up-to-date change object or null if change was not found - `com.google.api.services.dns.model.Change`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.api.services.dns.model.Change [^HttpDnsRpc this ^java.lang.String zone-name ^java.lang.String change-request-id ^java.util.Map options]
    (-> this (.getChangeRequest zone-name change-request-id options))))

(defn list-change-requests
  "Description copied from interface: DnsRpc

  zone-name - the name of a zone to which the Changes were be applied - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.Change>`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^HttpDnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.listChangeRequests zone-name options))))

(defn apply-change-request
  "Description copied from interface: DnsRpc

  zone-name - the name of a zone to which the Change should be applied - `java.lang.String`
  change-request - change to be applied - `com.google.api.services.dns.model.Change`
  options - a map of options for the service call - `java.util.Map`

  returns: updated change object with server-assigned ID - `com.google.api.services.dns.model.Change`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.api.services.dns.model.Change [^HttpDnsRpc this ^java.lang.String zone-name ^com.google.api.services.dns.model.Change change-request ^java.util.Map options]
    (-> this (.applyChangeRequest zone-name change-request options))))

(defn delete-zone
  "Description copied from interface: DnsRpc

  zone-name - `java.lang.String`

  returns: true if the zone was deleted and false otherwise - `boolean`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^Boolean [^HttpDnsRpc this ^java.lang.String zone-name]
    (-> this (.deleteZone zone-name))))

(defn create-batch
  "Description copied from interface: DnsRpc

  returns: `com.google.cloud.dns.spi.v1.RpcBatch`"
  (^com.google.cloud.dns.spi.v1.RpcBatch [^HttpDnsRpc this]
    (-> this (.createBatch))))

(defn get-zone
  "Description copied from interface: DnsRpc

  zone-name - name of the zone to be returned - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: a zone or null if not found - `com.google.api.services.dns.model.ManagedZone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.api.services.dns.model.ManagedZone [^HttpDnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.getZone zone-name options))))

(defn list-record-sets
  "Description copied from interface: DnsRpc

  zone-name - name of the zone to be listed - `java.lang.String`
  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.ResourceRecordSet>`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone was not found"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^HttpDnsRpc this ^java.lang.String zone-name ^java.util.Map options]
    (-> this (.listRecordSets zone-name options))))

(defn create
  "Description copied from interface: DnsRpc

  zone - a zone to be created - `com.google.api.services.dns.model.ManagedZone`
  options - a map of options for the service call - `java.util.Map`

  returns: Updated ManagedZone object - `com.google.api.services.dns.model.ManagedZone`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.api.services.dns.model.ManagedZone [^HttpDnsRpc this ^com.google.api.services.dns.model.ManagedZone zone ^java.util.Map options]
    (-> this (.create zone options))))

(defn list-zones
  "Description copied from interface: DnsRpc

  options - a map of options for the service call - `java.util.Map`

  returns: `com.google.cloud.dns.spi.v1.DnsRpc$ListResult<com.google.api.services.dns.model.ManagedZone>`

  throws: com.google.cloud.dns.DnsException - upon failure"
  (^com.google.cloud.dns.spi.v1.DnsRpc$ListResult [^HttpDnsRpc this ^java.util.Map options]
    (-> this (.listZones options))))

