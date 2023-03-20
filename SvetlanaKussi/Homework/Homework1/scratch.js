{
  "id": "198d4553-2fa4-42f6-a463-dba8e90f1abe",
  "version": "2.0",
  "name": "Google-JavaGuru",
  "url": "https://www.google.com",
  "tests": [{
    "id": "1e06c7fc-58a2-44ac-afc5-e088ec1d5feb",
    "name": "Google_Java",
    "commands": [{
      "id": "d6a4d856-9989-4f95-a4e6-a36af52b936b",
      "comment": "",
      "command": "open",
      "target": "/",
      "targets": [],
      "value": ""
    }, {
      "id": "e26d88d4-22f1-4254-85e4-18b5be509bf3",
      "comment": "",
      "command": "setWindowSize",
      "target": "723x860",
      "targets": [],
      "value": ""
    }, {
      "id": "4d463d25-f2c1-4770-9f8f-e852177c0f61",
      "comment": "",
      "command": "mouseOver",
      "target": "css=#gbwa .gb_e",
      "targets": [
        ["css=#gbwa .gb_e", "css:finder"],
        ["xpath=//div[@id='gbwa']/div/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, 'https://www.google.lv/intl/ru/about/products')]", "xpath:href"],
        ["xpath=//div[2]/div/div/div/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "5fc35442-da9d-44c8-bfac-a547e4f1aeb7",
      "comment": "",
      "command": "mouseOut",
      "target": "css=#gbwa .gb_e",
      "targets": [
        ["css=#gbwa .gb_e", "css:finder"],
        ["xpath=//div[@id='gbwa']/div/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, 'https://www.google.lv/intl/ru/about/products')]", "xpath:href"],
        ["xpath=//div[2]/div/div/div/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "975a65c6-25fa-4797-a296-fe2a33f2cd6c",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.gb_1e",
      "targets": [
        ["css=.gb_1e", "css:finder"]
      ],
      "value": ""
    }, {
      "id": "965ab174-286f-4a5f-b98d-d171d64bd73f",
      "comment": "",
      "command": "type",
      "target": "name=q",
      "targets": [
        ["name=q", "name"],
        ["css=.gLFyf", "css:finder"],
        ["xpath=//input[@name='q']", "xpath:attributes"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": "ja"
    }, {
      "id": "ac38c890-60e3-42f2-96ad-258a786c2f2d",
      "comment": "",
      "command": "click",
      "target": "css=#jZ2SBf b",
      "targets": [
        ["css=#jZ2SBf b", "css:finder"],
        ["xpath=//div[@id='jZ2SBf']/div/span/b", "xpath:idRelative"],
        ["xpath=//b", "xpath:position"],
        ["xpath=//b[contains(.,'va guru')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "354887f4-2a7a-41be-8c06-410ead16a476",
      "comment": "",
      "command": "click",
      "target": "css=.tF2Cxc > .yuRUbf .LC20lb",
      "targets": [
        ["css=.tF2Cxc > .yuRUbf .LC20lb", "css:finder"],
        ["xpath=//div[@id='rso']/div/div/div/div/div/div/div/div/a/h3", "xpath:idRelative"],
        ["xpath=//h3", "xpath:position"],
        ["xpath=//h3[contains(.,'JAVA GURU — профессиональные ИТ курсы | javaguru.lv')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "b39d455b-d783-4de3-834b-0c14dbb69a95",
      "comment": "",
      "command": "click",
      "target": "css=.menu li:nth-child(1) > a",
      "targets": [
        ["css=.menu li:nth-child(1) > a", "css:finder"],
        ["xpath=(//a[contains(text(),'Курсы')])[2]", "xpath:link"],
        ["xpath=(//a[contains(@href, 'https://javaguru.lv/kursy-programmirovanija/')])[2]", "xpath:href"],
        ["xpath=//div/div/div/div[2]/ul/li/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "9d8ef30b-dfe1-4315-b53d-337ec56b1b1d",
      "comment": "",
      "command": "mouseOver",
      "target": "css=.menu .current-menu-item > a",
      "targets": [
        ["css=.menu .current-menu-item > a", "css:finder"],
        ["xpath=(//a[contains(text(),'Курсы')])[2]", "xpath:link"],
        ["xpath=(//a[contains(@href, 'https://javaguru.lv/kursy-programmirovanija/')])[2]", "xpath:href"],
        ["xpath=//div[2]/ul/li/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "2b523ea2-2ceb-4bfd-ade5-9ff84b1cfb3c",
      "comment": "",
      "command": "mouseOut",
      "target": "css=.menu .current-menu-item > a",
      "targets": [
        ["css=.menu .current-menu-item > a", "css:finder"],
        ["xpath=(//a[contains(text(),'Курсы')])[2]", "xpath:link"],
        ["xpath=(//a[contains(@href, 'https://javaguru.lv/kursy-programmirovanija/')])[2]", "xpath:href"],
        ["xpath=//div[2]/ul/li/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "0f70f338-571b-4142-9a63-e1860aafdd61",
      "comment": "",
      "command": "click",
      "target": "linkText=Курс QA 2.0.",
      "targets": [
        ["linkText=Курс QA 2.0.", "linkText"],
        ["css=.single-list:nth-child(2) .single-course:nth-child(2) .course-content a", "css:finder"],
        ["xpath=//a[contains(text(),'Курс QA 2.0.')]", "xpath:link"],
        ["xpath=(//a[contains(@href, 'https://javaguru.lv/qa2/')])[2]", "xpath:href"],
        ["xpath=//div[2]/div[2]/div[2]/div/div[2]/h4/a", "xpath:position"],
        ["xpath=//a[contains(.,'Курс QA 2.0.')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "7b0772b4-e58b-46b3-8ef3-8e1e8b965a80",
      "comment": "",
      "command": "click",
      "target": "name=form-name",
      "targets": [
        ["name=form-name", "name"],
        ["css=.name-input", "css:finder"],
        ["xpath=//input[@name='form-name']", "xpath:attributes"],
        ["xpath=//form[@id='single-course-form']/div/input", "xpath:idRelative"],
        ["xpath=//form/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "0362dbb2-1daa-4360-bffa-89b60097bba8",
      "comment": "",
      "command": "type",
      "target": "name=form-name",
      "targets": [
        ["name=form-name", "name"],
        ["css=.name-input", "css:finder"],
        ["xpath=//input[@name='form-name']", "xpath:attributes"],
        ["xpath=//form[@id='single-course-form']/div/input", "xpath:idRelative"],
        ["xpath=//form/div/input", "xpath:position"]
      ],
      "value": "Lana"
    }, {
      "id": "72395952-659c-496f-b04c-14128c93ee10",
      "comment": "",
      "command": "click",
      "target": "name=form-phone",
      "targets": [
        ["name=form-phone", "name"],
        ["css=.phone-input", "css:finder"],
        ["xpath=//input[@name='form-phone']", "xpath:attributes"],
        ["xpath=//form[@id='single-course-form']/div[2]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "5aa07632-ffcb-48ad-a885-5042982ce187",
      "comment": "",
      "command": "type",
      "target": "name=form-phone",
      "targets": [
        ["name=form-phone", "name"],
        ["css=.phone-input", "css:finder"],
        ["xpath=//input[@name='form-phone']", "xpath:attributes"],
        ["xpath=//form[@id='single-course-form']/div[2]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": "111"
    }, {
      "id": "ce215d0f-ffcd-4768-b186-40c5e91fca34",
      "comment": "",
      "command": "click",
      "target": "css=.default-button-submit",
      "targets": [
        ["css=.default-button-submit", "css:finder"],
        ["xpath=//input[@value='Зарегистрироваться']", "xpath:attributes"],
        ["xpath=//form[@id='single-course-form']/div[6]/input", "xpath:idRelative"],
        ["xpath=//div[6]/input", "xpath:position"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "63795601-4f72-4576-87fb-1ac05e0d9ab9",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["1e06c7fc-58a2-44ac-afc5-e088ec1d5feb"]
  }],
  "urls": ["https://www.google.com/"],
  "plugins": []
}