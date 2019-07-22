(ns com.google.cloud.dns.ChangeRequest
  "An immutable class representing an atomic update to a collection of RecordSets within a
  Zone."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ChangeRequest]))

(defn get-zone
  "Returns the name of the Zone associated with this change request.

  returns: `java.lang.String`"
  (^java.lang.String [^ChangeRequest this]
    (-> this (.getZone))))

(defn get-dns
  "Returns the change request's Dns object used to issue requests.

  returns: `com.google.cloud.dns.Dns`"
  (^com.google.cloud.dns.Dns [^ChangeRequest this]
    (-> this (.getDns))))

(defn apply-to
  "Applies this change request to the zone identified by zoneName.

  zone-name - `java.lang.String`
  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure or if zone is not found"
  (^com.google.cloud.dns.ChangeRequest [^ChangeRequest this ^java.lang.String zone-name ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.applyTo zone-name options))))

(defn reload
  "Retrieves the up-to-date information about the change request from Google Cloud DNS. Parameter
   options can be used to restrict the fields to be included in the updated object the
   same way as in Dns.getChangeRequest(String, String, Dns.ChangeRequestOption...). If
   options are provided, any field other than generatedId which is not included in the
   options will be null regardless of whether they are initialized or not in
   this instance.

  options - `com.google.cloud.dns.Dns$ChangeRequestOption`

  returns: an object with the updated information or null if it does not exist - `com.google.cloud.dns.ChangeRequest`

  throws: com.google.cloud.dns.DnsException - upon failure of the API call or if the associated zone was not found"
  (^com.google.cloud.dns.ChangeRequest [^ChangeRequest this ^com.google.cloud.dns.Dns$ChangeRequestOption options]
    (-> this (.reload options))))

(defn done?
  "Returns true if the change request has been completed. If the status is not ChangeRequestInfo.Status.DONE already, the method makes an API call to Google Cloud DNS to
   update the change request first.

  returns: `boolean`

  throws: com.google.cloud.dns.DnsException - upon failure of the API call or if the associated zone was not found"
  (^Boolean [^ChangeRequest this]
    (-> this (.isDone))))

(defn to-builder
  "Description copied from class: ChangeRequestInfo

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ChangeRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ChangeRequest this]
    (-> this (.hashCode))))

