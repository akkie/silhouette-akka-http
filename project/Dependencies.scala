/**
 * Copyright 2016 Mohiva Organisation (license at mohiva dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import sbt._

object Dependencies {

  object Versions {
    val crossScala = Seq("2.11.8")
    val scalaVersion = crossScala.head
    val silhouette = "1.0.0-SNAPSHOT"
    val specs2 = "3.6.6"
    val akka = "2.4.10"
  }

  val resolvers = Seq(
    Resolver.sonatypeRepo("snapshots")
  )

  object Library {

    object Silhouette {
      val core = "com.mohiva" %% "silhouette" % Versions.silhouette
    }

    object Specs2 {
      val core = "org.specs2" %% "specs2-core" % Versions.specs2
      val matcherExtra = "org.specs2" %% "specs2-matcher-extra" % Versions.specs2
      val mock = "org.specs2" %% "specs2-mock" % Versions.specs2
    }
    val akkaHttp = "com.typesafe.akka" %% "akka-http-core" % Versions.akka
  }
}
