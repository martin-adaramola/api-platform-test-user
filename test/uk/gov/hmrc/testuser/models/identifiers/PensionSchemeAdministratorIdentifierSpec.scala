/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.testuser.models.identifiers

import uk.gov.hmrc.apiplatform.modules.common.utils.HmrcSpec

import uk.gov.hmrc.testuser.models.PensionSchemeAdministratorIdentifier

class PensionSchemeAdministratorIdentifierSpec extends HmrcSpec {
  val psaIdentifier: PensionSchemeAdministratorIdentifier = PensionSchemeAdministratorIdentifier("abc123")

  "toString returns inner value" in {
    psaIdentifier.toString shouldBe "abc123"
  }

  "name returns name of class" in {
    psaIdentifier.name shouldBe "pensionSchemeAdministratorIdentifier"
  }

  "value property returns inner value" in {
    psaIdentifier.value shouldBe "abc123"
  }
}
