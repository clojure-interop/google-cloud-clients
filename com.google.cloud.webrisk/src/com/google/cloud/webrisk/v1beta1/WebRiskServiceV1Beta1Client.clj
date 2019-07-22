(ns com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client
  "Service Description: Web Risk v1beta1 API defines an interface to detect malicious URLs on your
  website and in client applications.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
    ThreatType threatType = ThreatType.THREAT_TYPE_UNSPECIFIED;
    ByteString versionToken = ByteString.copyFromUtf8(\"\");
    ComputeThreatListDiffRequest.Constraints constraints = ComputeThreatListDiffRequest.Constraints.newBuilder().build();
    ComputeThreatListDiffResponse response = webRiskServiceV1Beta1Client.computeThreatListDiff(threatType, versionToken, constraints);
  }

  Note: close() needs to be called on the webRiskServiceV1Beta1Client object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of WebRiskServiceV1Beta1Settings
  to create(). For example:

  To customize credentials:



  WebRiskServiceV1Beta1Settings webRiskServiceV1Beta1Settings =
      WebRiskServiceV1Beta1Settings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client =
      WebRiskServiceV1Beta1Client.create(webRiskServiceV1Beta1Settings);

  To customize the endpoint:



  WebRiskServiceV1Beta1Settings webRiskServiceV1Beta1Settings =
      WebRiskServiceV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
  WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client =
      WebRiskServiceV1Beta1Client.create(webRiskServiceV1Beta1Settings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.webrisk.v1beta1 WebRiskServiceV1Beta1Client]))

(defn *create
  "Constructs an instance of WebRiskServiceV1Beta1Client, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings`

  returns: `com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client`

  throws: java.io.IOException"
  (^com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client [^com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings settings]
    (WebRiskServiceV1Beta1Client/create settings))
  (^com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client []
    (WebRiskServiceV1Beta1Client/create )))

(defn get-settings
  "returns: `com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings`"
  (^com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings [^WebRiskServiceV1Beta1Client this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1Stub`"
  ([^WebRiskServiceV1Beta1Client this]
    (-> this (.getStub))))

(defn search-hashes
  "Gets the full hashes that match the requested hash prefix. This is used after a hash prefix is
   looked up in a threatList and there is a match. The client side threatList only holds partial
   hashes so the client must query this method to determine if there is a full hash match of a
   threat.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     ByteString hashPrefix = ByteString.copyFromUtf8(\"\");
     List<ThreatType> threatTypes = new ArrayList<>();
     SearchHashesResponse response = webRiskServiceV1Beta1Client.searchHashes(hashPrefix, threatTypes);
   }

  hash-prefix - A hash prefix, consisting of the most significant 4-32 bytes of a SHA256 hash. For JSON requests, this field is base64-encoded. - `com.google.protobuf.ByteString`
  threat-types - Required. The ThreatLists to search in. - `java.util.List`

  returns: `com.google.webrisk.v1beta1.SearchHashesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.webrisk.v1beta1.SearchHashesResponse [^WebRiskServiceV1Beta1Client this ^com.google.protobuf.ByteString hash-prefix ^java.util.List threat-types]
    (-> this (.searchHashes hash-prefix threat-types)))
  (^com.google.webrisk.v1beta1.SearchHashesResponse [^WebRiskServiceV1Beta1Client this ^com.google.webrisk.v1beta1.SearchHashesRequest request]
    (-> this (.searchHashes request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^WebRiskServiceV1Beta1Client this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^WebRiskServiceV1Beta1Client this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^WebRiskServiceV1Beta1Client this]
    (-> this (.shutdown))))

(defn compute-threat-list-diff-callable
  "Gets the most recent threat list diffs.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     ThreatType threatType = ThreatType.THREAT_TYPE_UNSPECIFIED;
     ComputeThreatListDiffRequest.Constraints constraints = ComputeThreatListDiffRequest.Constraints.newBuilder().build();
     ComputeThreatListDiffRequest request = ComputeThreatListDiffRequest.newBuilder()
       .setThreatType(threatType)
       .setConstraints(constraints)
       .build();
     ApiFuture<ComputeThreatListDiffResponse> future = webRiskServiceV1Beta1Client.computeThreatListDiffCallable().futureCall(request);
     // Do something
     ComputeThreatListDiffResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.ComputeThreatListDiffRequest,com.google.webrisk.v1beta1.ComputeThreatListDiffResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Client this]
    (-> this (.computeThreatListDiffCallable))))

(defn search-hashes-callable
  "Gets the full hashes that match the requested hash prefix. This is used after a hash prefix is
   looked up in a threatList and there is a match. The client side threatList only holds partial
   hashes so the client must query this method to determine if there is a full hash match of a
   threat.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     SearchHashesRequest request = SearchHashesRequest.newBuilder().build();
     ApiFuture<SearchHashesResponse> future = webRiskServiceV1Beta1Client.searchHashesCallable().futureCall(request);
     // Do something
     SearchHashesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchHashesRequest,com.google.webrisk.v1beta1.SearchHashesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Client this]
    (-> this (.searchHashesCallable))))

(defn close
  ""
  ([^WebRiskServiceV1Beta1Client this]
    (-> this (.close))))

(defn search-uris
  "This method is used to check whether a URI is on a given threatList.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     String uri = \"\";
     List<ThreatType> threatTypes = new ArrayList<>();
     SearchUrisResponse response = webRiskServiceV1Beta1Client.searchUris(uri, threatTypes);
   }

  uri - The URI to be checked for matches. - `java.lang.String`
  threat-types - Required. The ThreatLists to search in. - `java.util.List`

  returns: `com.google.webrisk.v1beta1.SearchUrisResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.webrisk.v1beta1.SearchUrisResponse [^WebRiskServiceV1Beta1Client this ^java.lang.String uri ^java.util.List threat-types]
    (-> this (.searchUris uri threat-types)))
  (^com.google.webrisk.v1beta1.SearchUrisResponse [^WebRiskServiceV1Beta1Client this ^com.google.webrisk.v1beta1.SearchUrisRequest request]
    (-> this (.searchUris request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^WebRiskServiceV1Beta1Client this]
    (-> this (.isTerminated))))

(defn compute-threat-list-diff
  "Gets the most recent threat list diffs.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     ThreatType threatType = ThreatType.THREAT_TYPE_UNSPECIFIED;
     ByteString versionToken = ByteString.copyFromUtf8(\"\");
     ComputeThreatListDiffRequest.Constraints constraints = ComputeThreatListDiffRequest.Constraints.newBuilder().build();
     ComputeThreatListDiffResponse response = webRiskServiceV1Beta1Client.computeThreatListDiff(threatType, versionToken, constraints);
   }

  threat-type - Required. The ThreatList to update. - `com.google.webrisk.v1beta1.ThreatType`
  version-token - The current version token of the client for the requested list (the client version that was received from the last successful diff). - `com.google.protobuf.ByteString`
  constraints - The constraints associated with this request. - `com.google.webrisk.v1beta1.ComputeThreatListDiffRequest$Constraints`

  returns: `com.google.webrisk.v1beta1.ComputeThreatListDiffResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.webrisk.v1beta1.ComputeThreatListDiffResponse [^WebRiskServiceV1Beta1Client this ^com.google.webrisk.v1beta1.ThreatType threat-type ^com.google.protobuf.ByteString version-token ^com.google.webrisk.v1beta1.ComputeThreatListDiffRequest$Constraints constraints]
    (-> this (.computeThreatListDiff threat-type version-token constraints)))
  (^com.google.webrisk.v1beta1.ComputeThreatListDiffResponse [^WebRiskServiceV1Beta1Client this ^com.google.webrisk.v1beta1.ComputeThreatListDiffRequest request]
    (-> this (.computeThreatListDiff request))))

(defn search-uris-callable
  "This method is used to check whether a URI is on a given threatList.

   Sample code:



   try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client = WebRiskServiceV1Beta1Client.create()) {
     String uri = \"\";
     List<ThreatType> threatTypes = new ArrayList<>();
     SearchUrisRequest request = SearchUrisRequest.newBuilder()
       .setUri(uri)
       .addAllThreatTypes(threatTypes)
       .build();
     ApiFuture<SearchUrisResponse> future = webRiskServiceV1Beta1Client.searchUrisCallable().futureCall(request);
     // Do something
     SearchUrisResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchUrisRequest,com.google.webrisk.v1beta1.SearchUrisResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebRiskServiceV1Beta1Client this]
    (-> this (.searchUrisCallable))))

(defn shutdown-now
  ""
  ([^WebRiskServiceV1Beta1Client this]
    (-> this (.shutdownNow))))

