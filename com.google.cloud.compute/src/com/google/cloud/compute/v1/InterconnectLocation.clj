(ns com.google.cloud.compute.v1.InterconnectLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocation]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectLocation`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^com.google.cloud.compute.v1.InterconnectLocation prototype]
    (InterconnectLocation/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder []
    (InterconnectLocation/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectLocation`"
  (^com.google.cloud.compute.v1.InterconnectLocation []
    (InterconnectLocation/getDefaultInstance )))

(defn get-availability-zone
  "[Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   Example: \"zone1\" or \"zone2\".

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getAvailabilityZone))))

(defn get-continent
  "[Output Only] Continent for this location, which can take one of the following values: - AFRICA
   - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getContinent))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   locations.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of this InterconnectLocation, which can take one of the following
   values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   Interconnects.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectLocation this]
    (-> this (.getFieldMask))))

(defn get-region-infos-list
  "[Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   pertaining to the relation between this InterconnectLocation and various Google Cloud regions.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectLocationRegionInfo>`"
  (^java.util.List [^InterconnectLocation this]
    (-> this (.getRegionInfosList))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.toString))))

(defn get-address
  "[Output Only] The postal address of the Point of Presence, each line in the address is
   separated by a newline character.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getAddress))))

(defn get-facility-provider-facility-id
  "[Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getFacilityProviderFacilityId))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectLocation this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getName))))

(defn get-peeringdb-facility-id
  "[Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   peeringdb).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getPeeringdbFacilityId))))

(defn get-description
  "[Output Only] An optional description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectLocation this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectLocation this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getCreationTimestamp))))

(defn get-facility-provider
  "[Output Only] The name of the provider for this facility (e.g., EQUINIX).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getFacilityProvider))))

(defn get-city
  "[Output Only] Metropolitan area designator that indicates which city an interconnect is
   located. For example: \"Chicago, IL\", \"Amsterdam, Netherlands\".

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation this]
    (-> this (.getCity))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectLocation this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation this]
    (-> this (.toBuilder))))

