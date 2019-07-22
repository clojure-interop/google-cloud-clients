(ns com.google.cloud.dns.spi.v1.RpcBatch
  "An interface for the collection of batch operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 RpcBatch]))

(defn add-create-zone
  "Adds a call to \"create zone\" to the batch with the provided callback and options.

  zone - `com.google.api.services.dns.model.ManagedZone`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.api.services.dns.model.ManagedZone zone ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addCreateZone zone callback options))))

(defn add-get-zone
  "Adds a call to \"get zone\" to the batch with the provided callback and options.
   The zone to be retrieved is identified by zoneName.

  zone-name - `java.lang.String`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^java.lang.String zone-name ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addGetZone zone-name callback options))))

(defn add-list-change-requests
  "Adds a call to \"list change requests\" to the batch with the provided callback and
   options. The zone whose change requests are to be listed is identified by zoneName.

  zone-name - `java.lang.String`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^java.lang.String zone-name ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addListChangeRequests zone-name callback options))))

(defn add-get-project
  "Adds a call to \"get project\" to the batch with the provided callback and options.

  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addGetProject callback options))))

(defn add-list-zones
  "Adds a call to \"list zones\" to the batch with the provided callback and options.

  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addListZones callback options))))

(defn add-get-change-request
  "Adds a call to \"get change request\" to the batch with the provided callback and options. The change request to be retrieved is identified by changeRequestId. The zone
   to which the change request was applied is identified by zoneName.

  zone-name - `java.lang.String`
  change-request-id - `java.lang.String`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^java.lang.String zone-name ^java.lang.String change-request-id ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addGetChangeRequest zone-name change-request-id callback options))))

(defn submit
  "Submits a batch of requests for processing using a single RPC request to Cloud DNS."
  ([^RpcBatch this]
    (-> this (.submit))))

(defn add-apply-change-request
  "Adds a call to \"apply change request\" to the batch with the provided callback and
   options. The parameter change is the change request to be applied. The zone to
   which the change request should be applied is identified by zoneName.

  zone-name - `java.lang.String`
  change - `com.google.api.services.dns.model.Change`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^java.lang.String zone-name ^com.google.api.services.dns.model.Change change ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addApplyChangeRequest zone-name change callback options))))

(defn add-list-record-sets
  "Adds a call to \"list record sets\" to the batch with the provided callback and options. The zone whose record sets are to be listed is identified by zoneName.

  zone-name - `java.lang.String`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`
  options - `java.util.Map`"
  ([^RpcBatch this ^java.lang.String zone-name ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback ^java.util.Map options]
    (-> this (.addListRecordSets zone-name callback options))))

(defn add-delete-zone
  "Adds a call to \"delete zone\" to the batch with the provided callback. The zone to be
   deleted is identified by zoneName.

  zone-name - `java.lang.String`
  callback - `com.google.cloud.dns.spi.v1.RpcBatch$Callback`"
  ([^RpcBatch this ^java.lang.String zone-name ^com.google.cloud.dns.spi.v1.RpcBatch$Callback callback]
    (-> this (.addDeleteZone zone-name callback))))

