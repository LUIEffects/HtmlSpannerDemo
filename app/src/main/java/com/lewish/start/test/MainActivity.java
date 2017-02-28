package com.lewish.start.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.webkit.WebView;
import android.widget.TextView;

import com.lewish.start.htmlspanner.HtmlSpanner;

public class MainActivity extends AppCompatActivity {
    private TextView mTvContent;
    private WebView mWebView;
    private String mStr = "<html>\n" +
            "<body>\n" +
            "<p style=\"font-size:28px;line-height:22px;text-indent:2em;color:#80848c;margin:40px 30px\">\n" +
            "   资金出借人系依据出借人独立判断，自愿选择通过“银谷在线”（网址：http://www.yingujr.com）平台实施资金出借行 \n" +
            "\n" +
            "为的自然人、法人或其他组织。</p> \n" +
            "\n" +
            "  <p style=\"font-size:28px;text-indent:2em;line-height:22px;color:#80848c;margin:40px 30px 48px\"> 出借人在作出是否出借资金及出借资金具体金额的决策前，应全面了解可能存在的资金受损风险。出借人应对其作出 \n" +
            "\n" +
            "的选择、判断、行为承担全部责任及风险。\n" +
            "</p> \n" +
            "\n" +
            "  <p style=\"font-size:36px;color:#323743;margin:48px 30px 30px\"> 风险提示： </p>\n" +
            "\n" +
            "  <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\"> 1、政策风险：因国家政策调控对风险提示方管理和运营引起的风险，对出借人资金产生影响的，“银谷在线”平台 \n" +
            "\n" +
            "不承担任何责任。</p> \n" +
            "\n" +
            "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">2、借款人信用风险：当借款人短期或者长期丧失还款能力（包括但不限于借款人收入情况变化、财产状况发生恶化、 \n" +
            "\n" +
            "人身出现意外、发生疾病、死亡、家庭及所有的公司财产发生变化等情形 )，或者借款人的还款意愿、方式等发生变化时， \n" +
            "\n" +
            "出借人的出借资金可能无法按时足额得到偿还。 </p> \n" +
            "\n" +
            "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">3、资金流动性风险：在出借人需要进行债权转让时，需要按照《出借咨询与服务协议》、《债权转让服务协议》及《债 \n" +
            "\n" +
            "权转让协议》的约定自行申请进行债权转让产生的资金流动性风险。</p>  \n" +
            "\n" +
            "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">4、不可抗力的风险：出借人通过“银谷在线”平台实施资金出借行为时不可预见，并在等待借款人按照约定的期限 \n" +
            "\n" +
            "分期偿还出借人的本金和借款人可支付对价的过程中不可避免且不能克服的自然灾害、政府行为和社会性突发事件等不可 \n" +
            "\n" +
            "抗力因素的出现而可能导致出借人资金损失的风险。</p> \n" +
            "</body>\n" +
            "</html>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvContent = (TextView)findViewById(R.id.mTvContent);
//        mWebView = (WebView)findViewById(R.id.mWebView);
//        mWebView.getSettings().setDefaultTextEncodingName("UTF -8") ;
//        try {
//            mWebView.loadData(URLEncoder.encode(mStr, "UTF-8").replace("\\+", " "), "text/html", "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        mWebView.loadData(mStr, "text/html; charset=UTF-8", null) ;
        mTvContent.setText((new HtmlSpanner()).fromHtml("<html>\n" +
                "<body>\n" +
                "<p style=\"font-size:28px;line-height:22px;text-indent:2em;color:#80848c;margin:40px 30px\">\n" +
                "   资金出借人系依据出借人独立判断，自愿选择通过“银谷在线”（网址：http://www.yingujr.com）平台实施资金出借行 \n" +
                "\n" +
                "为的自然人、法人或其他组织。</p> \n" +
                "\n" +
                "  <p style=\"font-size:28px;text-indent:2em;line-height:22px;color:#80848c;margin:40px 30px 48px\"> 出借人在作出是否出借资金及出借资金具体金额的决策前，应全面了解可能存在的资金受损风险。出借人应对其作出 \n" +
                "\n" +
                "的选择、判断、行为承担全部责任及风险。\n" +
                "</p> \n" +
                "\n" +
                "  <p style=\"font-size:36px;color:#ff0000;margin:48px 30px 30px\"> 风险提示： </p>\n" +
                "\n" +
                "  <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\"> 1、政策风险：因国家政策调控对风险提示方管理和运营引起的风险，对出借人资金产生影响的，“银谷在线”平台 \n" +
                "\n" +
                "不承担任何责任。</p> \n" +
                "\n" +
                "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">2、借款人信用风险：当借款人短期或者长期丧失还款能力（包括但不限于借款人收入情况变化、财产状况发生恶化、 \n" +
                "\n" +
                "人身出现意外、发生疾病、死亡、家庭及所有的公司财产发生变化等情形 )，或者借款人的还款意愿、方式等发生变化时， \n" +
                "\n" +
                "出借人的出借资金可能无法按时足额得到偿还。 </p> \n" +
                "\n" +
                "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">3、资金流动性风险：在出借人需要进行债权转让时，需要按照《出借咨询与服务协议》、《债权转让服务协议》及《债 \n" +
                "\n" +
                "权转让协议》的约定自行申请进行债权转让产生的资金流动性风险。</p>  \n" +
                "\n" +
                "   <p style=\"font-size:28px;color:#80848c;line-height:22px;margin:30px 30px\">4、不可抗力的风险：出借人通过“银谷在线”平台实施资金出借行为时不可预见，并在等待借款人按照约定的期限 \n" +
                "\n" +
                "分期偿还出借人的本金和借款人可支付对价的过程中不可避免且不能克服的自然灾害、政府行为和社会性突发事件等不可 \n" +
                "\n" +
                "抗力因素的出现而可能导致出借人资金损失的风险。</p> \n" +
                "</body>\n" +
                "</html>"));
        mTvContent.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
