(ns com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Client
  "Service Description: Service to report phishing URIs.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client = PhishingProtectionServiceV1Beta1Client.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    String uri = \"\";
    ReportPhishingResponse response = phishingProtectionServiceV1Beta1Client.reportPhishing(parent, uri);
  }

  Note: close() needs to be called on the phishingProtectionServiceV1Beta1Client object to clean
  up resources such as threads. In the example above, try-with-resources is used, which
  automatically calls close().

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

  This class can be customized by passing in a custom instance of
  PhishingProtectionServiceV1Beta1Settings to create(). For example:

  To customize credentials:



  PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
      PhishingProtectionServiceV1Beta1Settings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
      PhishingProtectionServiceV1Beta1Client.create(phishingProtectionServiceV1Beta1Settings);

  To customize the endpoint:



  PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
      PhishingProtectionServiceV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
  PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
      PhishingProtectionServiceV1Beta1Client.create(phishingProtectionServiceV1Beta1Settings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1 PhishingProtectionServiceV1Beta1Client]))

(defn *create
  "Constructs an instance of PhishingProtectionServiceV1Beta1Client, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings`

  returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Client`

  throws: java.io.IOException"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Client [^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings settings]
    (PhishingProtectionServiceV1Beta1Client/create settings))
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Client []
    (PhishingProtectionServiceV1Beta1Client/create )))

(defn get-settings
  "returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings`"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings [^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1Stub`"
  ([^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^PhishingProtectionServiceV1Beta1Client this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.close))))

(defn report-phishing-callable
  "Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   is completed, if its result verifies the existince of malicious phishing content, the site will
   be added the to [Google's Social Engineering
   lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   could get exposed to this threat in the future.

   Sample code:



   try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client = PhishingProtectionServiceV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String uri = \"\";
     ReportPhishingRequest request = ReportPhishingRequest.newBuilder()
       .setParent(parent.toString())
       .setUri(uri)
       .build();
     ApiFuture<ReportPhishingResponse> future = phishingProtectionServiceV1Beta1Client.reportPhishingCallable().futureCall(request);
     // Do something
     ReportPhishingResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.reportPhishingCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.isTerminated))))

(defn report-phishing
  "Reports a URI suspected of containing phishing content to be reviewed. Once the report review
   is completed, if its result verifies the existince of malicious phishing content, the site will
   be added the to [Google's Social Engineering
   lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that
   could get exposed to this threat in the future.

   Sample code:



   try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client = PhishingProtectionServiceV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String uri = \"\";
     ReportPhishingResponse response = phishingProtectionServiceV1Beta1Client.reportPhishing(parent, uri);
   }

  parent - Required. The name of the project for which the report will be created, in the format \"projects/{project_number}\". - `com.google.phishingprotection.v1beta1.ProjectName`
  uri - The URI that is being reported for phishing content to be analyzed. - `java.lang.String`

  returns: `com.google.phishingprotection.v1beta1.ReportPhishingResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.phishingprotection.v1beta1.ReportPhishingResponse [^PhishingProtectionServiceV1Beta1Client this ^com.google.phishingprotection.v1beta1.ProjectName parent ^java.lang.String uri]
    (-> this (.reportPhishing parent uri)))
  (^com.google.phishingprotection.v1beta1.ReportPhishingResponse [^PhishingProtectionServiceV1Beta1Client this ^com.google.phishingprotection.v1beta1.ReportPhishingRequest request]
    (-> this (.reportPhishing request))))

(defn shutdown-now
  ""
  ([^PhishingProtectionServiceV1Beta1Client this]
    (-> this (.shutdownNow))))

